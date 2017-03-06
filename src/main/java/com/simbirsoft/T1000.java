package com.simbirsoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.simbirsoft.api.Target;
import com.simbirsoft.api.Terminator;

@Component
public class T1000 implements Terminator {

    @Autowired
    @Qualifier("killTarget")
    private Target target;

    @Override
    public void showTarget() {
        System.out.print("T1000 target - ");
        target.show();
    }
}
