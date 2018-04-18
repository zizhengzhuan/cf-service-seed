package com.zzht.component.patrol.api;

import com.zzht.component.patrol.entity.Person;
import com.zzht.component.patrol.entity.PersonExample;

import java.util.List;

/**
 * Created by kunhour on 2018/4/16.
 */
public interface PersonService {

    public void createPerson(Person person);

    public List<Person> queryPerson(PersonExample example);
}
