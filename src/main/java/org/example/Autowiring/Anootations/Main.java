package org.example.Autowiring.Anootations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("org/example/Autowiring/Anootations/config.xml");
        Employee employee = (Employee) context.getBean("emp1");
        System.out.println(employee);
    }
}
