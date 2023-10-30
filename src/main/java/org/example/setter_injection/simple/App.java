package org.example.setter_injection.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("org/example/setter_injection/simple/config.xml");
        Student student1 = (Student) context.getBean("s1");
        System.out.println(student1);
        Student student2 = (Student) context.getBean("s2");
        System.out.println(student2);

    }
}
