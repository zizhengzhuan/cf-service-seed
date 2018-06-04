package com.zzht.service.demo.webservice.soap;

import com.zzht.component.demo.entity.Person;

import javax.jws.WebService;
import java.util.List;

/**
 * 类的描述
 * @author : kunhour
 * @version :1.0
 * @since : 2018/6/4 10:38
*/
@WebService
public interface PersonSoapService {
   /**
    * 创建
    * @param person 人员
    */
   public void createPerson(Person person);
   /**
    * 创建
    * @return List
    */
   public List<Person> queryPerson();
}
