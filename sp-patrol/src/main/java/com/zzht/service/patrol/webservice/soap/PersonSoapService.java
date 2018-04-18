package com.zzht.service.patrol.webservice.soap;

import com.zzht.component.patrol.entity.Person;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by kunhour on 2018/4/16.
 */
@WebService
public interface PersonSoapService {

   public void createPerson(Person preson);

   public List<Person> queryPerson();
}
