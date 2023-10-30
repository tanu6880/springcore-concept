package org.example.Autowiring.Xml;

import org.example.Constructor_injection.Ambiguity.Addition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("org/example/Autowiring/Xml/config.xml");
        Employee employee = (Employee) context.getBean("emp1");
        System.out.println(employee);
    }
}
