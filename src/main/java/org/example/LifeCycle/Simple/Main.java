package org.example.LifeCycle.Simple;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main( String[] args )
    {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("org/example/LifeCycle/Simple/config.xml");
        Cup student1 = (Cup) context.getBean("s1");
        System.out.println(student1);
        context.registerShutdownHook();

    }
}
