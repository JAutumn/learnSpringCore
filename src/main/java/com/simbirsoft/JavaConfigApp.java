package com.simbirsoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simbirsoft.api.Terminator;
import com.simbirsoft.config.Config;

public class JavaConfigApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Terminator t800 = context.getBean("t800", Terminator.class);
        t800.showTarget();

        Terminator t1000 = context.getBean("t1000", Terminator.class);
        t1000.showTarget();
    }
}
