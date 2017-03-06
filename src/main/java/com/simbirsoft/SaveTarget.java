package com.simbirsoft;

import org.springframework.stereotype.Component;

import com.simbirsoft.api.Target;

@Component
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
