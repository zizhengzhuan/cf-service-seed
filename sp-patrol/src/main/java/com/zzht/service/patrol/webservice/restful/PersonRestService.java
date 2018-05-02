package com.zzht.service.patrol.webservice.restful;

import javax.ws.rs.*;

import com.zzht.component.patrol.entity.Person;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

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
    @Description(value = "展示资源详情", target = DocTarget.METHOD)
    public Object queryPerson(@QueryParam("userId") @Description(value = "用户ID",target = DocTarget.PARAM) String userId);

	@GET
	@Path("/getPerson")
	public Object getPerson();

}
