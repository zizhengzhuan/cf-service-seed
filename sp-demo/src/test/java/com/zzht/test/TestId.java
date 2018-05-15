package com.zzht.test;

import com.zzht.cole.flower.common.tool.IdGenerator;
import com.zzht.cole.flower.common.tool.ResultTool;
import com.zzht.component.demo.entity.Person;

public class TestId {



    public static void main(String[] args) {
        System.out.println(IdGenerator.getId());



        System.out.println(ResultTool.toResponse(new Person()));
    }
}
