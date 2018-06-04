package com.zzht.service.demo.webservice.soap;

import com.zzht.component.demo.entity.Person;
import com.zzht.component.demo.api.PersonService;

import javax.annotation.Resource;
import javax.jws.WebService;
import java.util.List;

/**
 * 类的描述
 * @author : kunhour
 * @version :1.0
 * @since : 2018/6/4 10:39
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
