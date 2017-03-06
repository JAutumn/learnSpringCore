package com.simbirsoft;

import com.simbirsoft.api.Target;

public class Terminator {
    private Target target;

    public Terminator(Target target) {
        this.target = target;
    }

    public void showTarget() {
        target.show();
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
