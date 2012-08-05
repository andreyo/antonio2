package com.ao.model;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: Elena
 * Date: 05.08.12
 * Time: 13:06
 * To change this template use File | Settings | File Templates.
 */
public class UserBean implements Serializable {

    String name;
    String login;
    String password;

    public UserBean() {
    }

    public UserBean(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
