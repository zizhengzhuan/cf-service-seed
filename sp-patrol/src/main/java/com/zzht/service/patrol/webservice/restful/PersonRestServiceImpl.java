package com.zzht.service.patrol.webservice.restful;

import java.util.ArrayList;
import java.util.List;

import com.zzht.service.patrol.common.ResultWithPage;
import com.zzht.service.patrol.common.ResultTool;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.ecity.server.response.ResponseTool;
import com.zzht.component.patrol.api.PersonService;
import com.zzht.component.patrol.entity.Person;
import com.zzht.component.patrol.entity.PersonExample;

/**
 * @author kunhour
 * Created by kunhour on 2018/4/16.
 * restful风格接口
 */
// @RestController
public class PersonRestServiceImpl implements PersonRestService{
	@Autowired
	private PersonService personService;

    @Override
    public Object queryPerson() {

        List<Person> list = new ArrayList<>();
        /*
            Person p = new Person();
            p.setAge(1);
            p.setUserName("柯尊超");
            list.add(p);
        */
        list= personService.queryPerson(new PersonExample());
		ResultWithPage response = new ResultWithPage();
        response.setData(list);
        response.setTotal(2);
        return ResultTool.toResponse(response);
    }

	@Override
	public Object getPerson() {
		Person person = personService.selectByPrimaryKey(1L);
		return ResponseTool.strResponse(JSON.toJSONString(person));
	}


}
