package com.simbirsoft;

import org.springframework.stereotype.Component;

import com.simbirsoft.api.Target;

@Component
public class KillTarget implements Target {
    private String value;

    public KillTarget() {
        this.value = "Kill John Connor";
    }

    @Override
    public void show() {
        System.out.println(value);
    }
}
