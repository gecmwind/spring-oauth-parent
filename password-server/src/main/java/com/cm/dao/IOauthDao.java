package com.cm.dao;

import com.cm.entity.UserEntity;

/**
 * @author cm.ge.
 */
public interface IOauthDao {
    UserEntity getUserDetails(String username);
}
