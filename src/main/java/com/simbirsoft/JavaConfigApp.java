package com.simbirsoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simbirsoft.api.Terminator;
import com.simbirsoft.config.Config;

public class JavaConfigApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Terminator t1000first = context.getBean("t1000", Terminator.class);
        Terminator t1000second = context.getBean("t1000", Terminator.class);

        //T1000 - Singleton
        System.out.println(t1000first == t1000second);

        for (int i = 0; i < 10; i++) {
            //Random Target prototype
            t1000first.showTarget();
        }
    }
}
