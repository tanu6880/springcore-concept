package org.example.setter_injection.collection;


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

        ApplicationContext context = new ClassPathXmlApplicationContext("org/example/setter_injection/collection/config.xml");
        Student student1 = (Student) context.getBean("s1");
        System.out.println(student1);

    }
}
