package com.ao.services;

import com.ao.interfaces.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * User: andrey.osipov
 * Date: 8/3/12
 * Time: 2:21 PM
 */
@Stateless
@Remote(IUserService.class)
public class UserService {

    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    public void createUser() {
        log.info("CreateUser executed");
    }
}
