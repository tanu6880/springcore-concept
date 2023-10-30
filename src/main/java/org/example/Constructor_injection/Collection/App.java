package org.example.Constructor_injection.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("org/example/Constructor_injection/Collection/config.xml");
        Student student1 = (Student) context.getBean("s1");
        System.out.println(student1);

    }
}
