package com.simbirsoft;

public class App {
    public static void main(String[] args) {
        Terminator terminator = new Terminator(new KillTarget());
        terminator.showTarget();

        terminator.setTarget(new SaveTarget());
        terminator.showTarget();
    }
}
