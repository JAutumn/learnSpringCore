package com.simbirsoft;

import com.simbirsoft.api.Target;

public class Terminator {
    private Target target;

    //Constructor DI
    public Terminator(Target target) {
        this.target = target;
    }

    public void showTarget() {
        target.show();
    }

    //Setter DI
    public void setTarget(Target target) {
        this.target = target;
    }
}
