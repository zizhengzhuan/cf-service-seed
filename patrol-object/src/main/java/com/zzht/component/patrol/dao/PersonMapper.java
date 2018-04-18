package com.zzht.component.patrol.dao;

import com.zzht.component.patrol.entity.Person;
import com.zzht.component.patrol.entity.PersonExample;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface PersonMapper {
    int countByExample(PersonExample example);

    int deleteByExample(PersonExample example);

    int deleteByPrimaryKey(Long personId);

    int insert(Person record);

    int insertSelective(Person record);

    List<Person> selectByExample(PersonExample example);

    Person selectByPrimaryKey(Long personId);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}