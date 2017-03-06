package com.simbirsoft;

import com.simbirsoft.api.Target;

public class SaveTarget implements Target {
    private String value;

    public SaveTarget() {
        this.value = "Save John Connor";
    }

    @Override
    public void show() {
        System.out.println(value);
    }
}
