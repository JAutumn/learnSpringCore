package com.simbirsoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simbirsoft.api.Terminator;

public class XmlApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Terminator t800 = context.getBean(T800.class);
        t800.showTarget();

        Terminator t1000 = context.getBean(T1000.class);
        t1000.showTarget();

//        Error - expected single matching bean but found 2: t800,t1000
//        Terminator terminator = context.getBean(Terminator.class);
//        terminator.showTarget();

        Terminator terminator = context.getBean("t800", Terminator.class);
        terminator.showTarget();
    }
}
