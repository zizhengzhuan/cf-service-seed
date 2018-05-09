package com.zzht.component.demo.api;

import java.util.List;

import com.zzht.component.demo.entity.Person;
import com.zzht.component.demo.entity.PersonExample;

/**
 * Created by kunhour on 2018/4/16.
 */
public interface PersonService {

    public void createPerson(Person person);

    public List<Person> queryPerson(PersonExample example);

	Person selectByPrimaryKey(Long personId);
}
