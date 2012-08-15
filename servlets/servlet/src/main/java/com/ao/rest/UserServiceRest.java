package com.ao.rest;

import org.apache.log4j.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;
import java.net.URI;
import java.util.LinkedList;
import java.util.List;

/**
 * User: andrey.osipov
 * Date: 8/14/12
 * Time: 6:48 PM
 */
@Path("users")
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public class UserServiceRest {

    public UserServiceRest() {
    }

    private static final Logger log = Logger.getLogger(UserServiceRest.class);
    @Context
    private UriInfo uriInfo;

    @GET
    public List<UserBean> getUsers() {
        List<UserBean> userBeanList = new LinkedList<UserBean>();
        UserBean userBean = new UserBean();
        userBean.setLogin("davai");
        userBean.setName("do svidanya");
        userBeanList.add(userBean);
        return userBeanList;
    }

    @GET
    @Path("{id}/")
    public UserBean getUserById(@PathParam("id") Long id) {
        UserBean userBean = new UserBean();
        userBean.setLogin("davai_" + id);
        userBean.setName("do svidanya" + id);
        return userBean;
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public Response createUser(JAXBElement<UserBean> userBean) {
        URI userUri = uriInfo.getAbsolutePathBuilder().path("123").build();
        return Response.created(userUri).build();
    }

    @DELETE
    @Path("{id}/")
    public void deleteUser(@PathParam("id") Long id) {
        log.info("removing User: " + id);
    }
}
