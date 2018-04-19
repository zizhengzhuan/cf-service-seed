package com.zzht.service.patrol.webservice.restful;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.zzht.component.patrol.entity.Person;

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

	@GET
	@Path("/getPerson")
	public Object getPerson();

}
