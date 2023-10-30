package org.example.LifeCycle.Interface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main( String[] args )
    {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("org/example/LifeCycle/Interface/config.xml");
        Botel botel = (Botel) context.getBean("s1");
        System.out.println(botel);
        context.registerShutdownHook();

    }
}
