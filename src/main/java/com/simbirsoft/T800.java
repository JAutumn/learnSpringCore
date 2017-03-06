package com.simbirsoft;

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
        this.target = target;
    }

    public void showTarget() {
        System.out.print("T800 target - ");
        target.show();
    }
}
