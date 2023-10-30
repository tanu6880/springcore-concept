package org.example.Constructor_injection.Simple;

import org.example.setter_injection.collection.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("org/example/Constructor_injection/Simple/config.xml");
        Person p1 = (Person) context.getBean("p1");
        System.out.println(p1);

    }
}
