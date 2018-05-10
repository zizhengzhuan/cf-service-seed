package com.zzht.test;

import com.zzht.cole.flower.common.tool.IdGenerator;
import com.zzht.cole.flower.common.tool.ResultTool;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class TestId {

    public static void main(String[] args) {
        System.out.println(IdGenerator.getId());


        String path="D:\\tomcat85_30\\webapps\\ServiceEngine\\conf\\application.properties";
        Properties prop = new Properties();
        InputStream in ;
        try {
            in = new FileInputStream(path);
            prop.load(in);
            System.out.println(prop.getProperty("db.type"));

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
