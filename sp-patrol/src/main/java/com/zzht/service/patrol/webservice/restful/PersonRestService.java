package com.zzht.service.patrol.webservice.restful;

import com.zzht.component.patrol.entity.Person;

import javax.ws.rs.*;

/**
 * Created by kunhour on 2018/4/16.
 */
@Path("/person")
@Produces({ "application/json", "application/xml", "application/javascript", "text/html" })
public interface PersonRestService {

    @POST
    @Path("/createPerson")
    public void createPerson(Person person);

    @GET
    @Path("/queryPerson")
    public Object queryPerson();

}
