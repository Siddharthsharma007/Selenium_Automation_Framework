package com.cityio.config;

public class ConfigFactory {

    public static FrameworkConfig getconfig(){
       return org.aeonbits.owner.ConfigFactory.create(FrameworkConfig.class);
    }
}
