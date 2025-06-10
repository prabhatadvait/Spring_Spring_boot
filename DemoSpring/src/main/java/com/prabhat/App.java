package com.prabhat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // this is to create a container
        // But problem is it's giving error because object is still not created to create it use spring.xml

//        Dev obj = context.getBean(Dev.class);
        Dev obj  = (Dev) context.getBean("dev");  // "dev" is the id in spring.xml,this can be used instead above  line
        obj.build();
    }
}