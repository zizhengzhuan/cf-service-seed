package com.zzht.service.demo.webservice.soap;

import com.zzht.component.demo.entity.Person;
import com.zzht.component.demo.api.PersonService;

import javax.annotation.Resource;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by kunhour on 2018/4/16.
 * soap风格接口
 */
@WebService
public class PersonSoapServiceImpl implements PersonSoapService {

    @Resource
    private PersonService personService;

    @Override
    public void createPerson(Person person) {
        personService.createPerson(person);
    }

    @Override
    public List<Person> queryPerson() {
        return personService.queryPerson(null);
    }
}
