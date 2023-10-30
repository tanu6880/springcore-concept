package org.example.Constructor_injection.Ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("org/example/Constructor_injection/Ambiguity/config.xml");
        Addition student1 = (Addition) context.getBean("s1");
        System.out.println(student1);
    }
}
