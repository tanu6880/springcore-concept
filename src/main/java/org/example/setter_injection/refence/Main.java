package org.example.setter_injection.refence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("org/example/setter_injection/refence/config.xml");
        Employe emp1 = (Employe) context.getBean("s1");
        System.out.println(emp1);
    }
}
