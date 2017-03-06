package com.simbirsoft;

import com.simbirsoft.api.Target;
import com.simbirsoft.api.Terminator;

public class T1000 implements Terminator {
    private Target target;

    @Override
    public void showTarget() {
        System.out.print("T1000 target - ");
        target.show();
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
