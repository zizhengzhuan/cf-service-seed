package com.zzht.service.demo.webservice.restful;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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

//        List<Person> list = new ArrayList<Person>();
////        PersonPerson p = new Person();
////        p.setAge(1);
////        p.setUserName("柯尊超");
////        list.add(p);

        List<Person> list = personService.queryPerson(new PersonExample());
        return ResultTool.toResponse(list);
    }

	@Override
	public Object getPerson(String uId) {
        //假设不符合某种逻辑
        if(uId==null || uId.isEmpty()){
            return ResultTool.toError(PersonError.PARMA_ERROR,"userId");
        }

		Person person = personService.selectByPrimaryKey(1L);
        return ResultTool.toResponse(person);
	}


}
