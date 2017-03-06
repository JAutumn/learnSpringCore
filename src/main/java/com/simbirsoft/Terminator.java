package com.simbirsoft;

public class Terminator {
    private Target target;

    public Terminator() {
        this.target = new Target();
    }

    public void showTarget() {
        target.show();
    }
}
