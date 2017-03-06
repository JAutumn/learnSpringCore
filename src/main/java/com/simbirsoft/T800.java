package com.simbirsoft;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.simbirsoft.api.Target;
import com.simbirsoft.api.Terminator;

@Component
public class T800 implements Terminator {
    private Target target;

    @Autowired
    public T800(@Qualifier("saveTarget") Target target) {
        System.out.println("T800 constructor call");
        this.target = target;
    }

    @PostConstruct
    public void init() {
        System.out.println("T800 postconstruct call");
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("T800 predestroy call");
    }

    public void showTarget() {
        System.out.print("T800 target - ");
        target.show();
    }
}
