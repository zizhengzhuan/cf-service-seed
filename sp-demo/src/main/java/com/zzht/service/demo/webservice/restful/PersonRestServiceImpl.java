package com.zzht.service.demo.webservice.restful;

import java.util.List;

import com.zzht.cole.flower.common.response.Result;
import com.zzht.cole.flower.common.response.ResultWithPage;
import com.zzht.cole.flower.common.tool.ResultTool;
import org.springframework.beans.factory.annotation.Autowired;

import com.zzht.component.demo.api.PersonService;
import com.zzht.component.demo.entity.Person;
import com.zzht.component.demo.entity.PersonExample;

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
    public Object queryPerson(String userId) {
        /*
        List<Person> list = new ArrayList<Person>();

            PersonPerson p = new Person();
            p.setAge(1);
            p.setUserName("柯尊超");
            list.add(p);
        */

        List<Person> list= personService.queryPerson(new PersonExample());
		ResultWithPage<List<Person>> result = new ResultWithPage<>();
        result.setData(list);
        result.setTotal(2);
        return ResultTool.toResponse(result);
    }

	@Override
	public Object getPerson() {
		Person person = personService.selectByPrimaryKey(1L);
        Result<Person> result = new Result<>();
        result.setData(person);
        return ResultTool.toResponse(result);
	}


}
