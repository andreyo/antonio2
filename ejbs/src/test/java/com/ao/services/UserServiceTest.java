package com.ao.services;

import com.ao.model.UserBean;
import org.junit.Test;

/**
 * User: andrey.osipov
 * Date: 8/3/12
 * Time: 2:45 PM
 */
public class UserServiceTest {

    @Test
    public void testName() throws Exception {
        new UserService().createUser(new UserBean());
    }
}
