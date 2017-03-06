package com.simbirsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.simbirsoft.api.Terminator;

@SpringBootApplication
public class SpringBootApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootApp.class, args);

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
