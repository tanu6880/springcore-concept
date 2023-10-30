package org.example.LifeCycle.Annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main( String[] args )
    {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("org/example/LifeCycle/Annotation/config.xml");
        Book book = (Book) context.getBean("s1");
        System.out.println(book);
        context.registerShutdownHook();

    }
}
