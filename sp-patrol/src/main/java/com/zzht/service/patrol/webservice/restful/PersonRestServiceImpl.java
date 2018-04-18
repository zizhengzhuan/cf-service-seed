package com.zzht.service.patrol.webservice.restful;

import com.alibaba.fastjson.JSON;
import com.ecity.server.response.ResponseTool;
import com.zzht.component.patrol.api.PersonServiceImpl;
import com.zzht.component.patrol.entity.Person;
import com.zzht.component.patrol.api.PersonService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kunhour on 2018/4/16.
 * restful风格接口
 */

public class PersonRestServiceImpl implements PersonRestService{

    private PersonService personService=new PersonServiceImpl();
    @Override
    public void createPerson(Person person) {


    }

    @Override
    public Object queryPerson() {

        List<Person> list = new ArrayList<>();
//        Person p = new Person();
//        p.setAge(1);
//        p.setUserName("柯尊超");
//        list.add(p);
        list= personService.queryPerson(null);
        return ResponseTool.strResponse(JSON.toJSONString(list));
    }

}
