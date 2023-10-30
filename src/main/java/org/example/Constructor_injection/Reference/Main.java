package org.example.Constructor_injection.Reference;

import org.example.Constructor_injection.Reference.Employe;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("org/example/Constructor_injection/Reference/config.xml");
        Employe emp1 = (Employe) context.getBean("s1");
        System.out.println(emp1);
    }
}
