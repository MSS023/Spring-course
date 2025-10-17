package com.sahni;

import com.sahni.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj = context.getBean("alien", Alien.class);
////        obj.setAge(21);
//        System.out.println(obj.getAge());
//        obj.code();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien obj = context.getBean(Alien.class);
        System.out.println(obj.getAge());
        obj.code();
//        Desktop dt = context.getBean("beast", Desktop.class);
//
//        Desktop dt2 = context.getBean("desktop", Desktop.class);
    }
}
