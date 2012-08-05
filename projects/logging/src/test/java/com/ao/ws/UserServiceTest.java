package com.ao.ws;

import com.ao.services.UserBean;
import com.ao.services.UserService;
import com.ao.services.UserServiceService;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 05.08.12
 * Time: 19:00
 * To change this template use File | Settings | File Templates.
 */
public class UserServiceTest {

    @Test
    public void testName() throws Exception {
        UserServiceService userService = new UserServiceService();
        UserService userServicePort = userService.getUserServicePort();
        userServicePort.createUser(new UserBean());
    }
}
