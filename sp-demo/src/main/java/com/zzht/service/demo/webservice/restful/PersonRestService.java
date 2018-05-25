package com.zzht.service.demo.webservice.restful;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

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
    @POST
    @Path("/queryPerson")
    @Consumes(MediaType.APPLICATION_XML)
    @Description(value = "查询人员列表", target = DocTarget.METHOD)
    public Object queryPerson(@FormParam("userId") @Description(value = "用户ID",target = DocTarget.PARAM) String userId);

    /**
     * 查询人员
     * @return 响应
     */
	@GET
	@Path("/getPerson")
	public Object getPerson();

}
