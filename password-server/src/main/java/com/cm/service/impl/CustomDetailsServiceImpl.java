package com.cm.service.impl;

import com.cm.dao.IOauthDao;
import com.cm.dao.impl.OAuthDaoImpl;
import com.cm.entity.CustomUser;
import com.cm.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private IOauthDao oauthDao;

    @Override
    public CustomUser loadUserByUsername(final String username) throws UsernameNotFoundException {
        UserEntity userEntity = null;
        try {
            userEntity = oauthDao.getUserDetails(username);
            CustomUser customUser = new CustomUser(userEntity);
            return customUser;
        } catch (Exception e) {
            e.printStackTrace();
            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        }
    }
}
