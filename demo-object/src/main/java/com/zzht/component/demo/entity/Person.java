package com.zzht.component.demo.entity;

/**
 * 类的描述
 * @author : kunhour
 * @version :1.0
 * @since : 2018/6/4 10:39
*/
public class Person {
    private Long personId;

    private String userName;

    private Integer age;

    private Integer sex;

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}