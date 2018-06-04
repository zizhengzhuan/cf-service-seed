package com.zzht.component.demo.api;

import java.util.List;

import com.zzht.component.demo.entity.Person;
import com.zzht.component.demo.entity.PersonExample;

/**
 * 类的描述
 * @author : kunhour
 * @version :1.0
 * @since : 2018/6/4 10:38
*/
public interface PersonService {
    /**
     * 创建
     * @param person 人员
     */
    public void createPerson(Person person);
    /**
     * 创建
     * @param example 条件
     * @return List
     */
    public List<Person> queryPerson(PersonExample example);

    /**
     * 创建
     * @param personId id
     * @return Person
     */
	Person selectByPrimaryKey(Long personId);
}
