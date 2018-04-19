package com.zzht.component.patrol.api;

import com.zzht.component.patrol.dao.PersonMapper;
import com.zzht.component.patrol.entity.Person;
import com.zzht.component.patrol.entity.PersonExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kunhour
 * Created by kunhour on 2018/4/16.
 *
 */
@Service("dPersonService")
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personDao;

    @Override
    public void createPerson(Person person) {
        personDao.insert(person);
    }

    @Override
    public List<Person> queryPerson(PersonExample example) {
        return personDao.selectByExample(example);
    }
}
