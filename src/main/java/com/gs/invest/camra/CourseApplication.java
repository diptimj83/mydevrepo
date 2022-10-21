package com.gs.invest.camra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CourseApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext=
        SpringApplication.run(CourseApplication.class,args);
        Course course=applicationContext.getBean(Course.class);
        /*for(String name: applicationContext.getBeanDefinitionNames())
        {
            System.out.println(name);
        }*/
    }
}
