package com.shahed.javaee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Properties;

public class BaseController {
    @Qualifier(value = "configProperties")
    @Autowired
    private Properties properties;

    protected String getPropertyValue(String propertyKey){
        return properties.getProperty(propertyKey);
    }
}
