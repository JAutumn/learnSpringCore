package com.simbirsoft;

import com.simbirsoft.api.Target;

public class KillTarget implements Target {
    private String value;

    public KillTarget() {
        this.value = "Kill Sarah Connor";
    }

    @Override
    public void show() {
        System.out.println(value);
    }
}
