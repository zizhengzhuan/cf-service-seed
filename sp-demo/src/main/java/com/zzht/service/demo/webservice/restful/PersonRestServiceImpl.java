package com.zzht.service.demo.webservice.restful;

import java.util.List;

import com.zzht.cole.flower.common.tool.ResultTool;
import com.zzht.service.demo.exception.PersonError;
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

        List<Person> list= personService.queryPerson(new PersonExample());
        return ResultTool.toResponse(list);


    }

	@Override
	public Object getPerson() {
        if(1==1){ //假设不符合某种逻辑
            return ResultTool.toError(PersonError.PARAM_ERROR,"用户名");
        }

		Person person = personService.selectByPrimaryKey(1L);
        return ResultTool.toResponse(person);
	}


}
