package com.simbirsoft;

import java.util.Random;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.simbirsoft.api.Target;

@Component
@Scope(scopeName = BeanDefinition.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.INTERFACES)
public class RandomTarget implements Target {
    private String[] availableValues = {"Save John Connor", "Kill John Connor", "Melt"};
    private String value;

    public RandomTarget() {
        Random random = new Random();
        this.value = availableValues[random.nextInt(availableValues.length)];
    }

    @Override
    public void show() {
        System.out.println(value);
    }
}
