package com.simbirsoft;

import com.simbirsoft.api.Target;
import com.simbirsoft.api.Terminator;

public class T800 implements Terminator {
    private Target target;

    public T800(Target target) {
        this.target = target;
    }

    public void showTarget() {
        System.out.print("T800 target - ");
        target.show();
    }
}
