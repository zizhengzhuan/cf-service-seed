package com.zzht.service.patrol.webservice.restful;

import com.zzht.component.patrol.entity.Person;

import javax.ws.rs.*;

/**
 * @author kunhour
 * Created by kunhour on 2018/4/16.
 */
@Path("/person")
@Produces({ "application/json", "application/xml", "application/javascript", "text/html" })
public interface PersonRestService {

    /**
     * 返回的是List
     * @return
     */
    @GET
    @Path("/queryPerson")
    public Object queryPerson();

}
