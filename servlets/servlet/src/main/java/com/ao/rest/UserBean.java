package com.ao.rest;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * User: andrey.osipov
 * Date: 8/14/12
 * Time: 7:18 PM
 */
@XmlRootElement
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

    @Override
    public String toString() {
        return "UserBean{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
