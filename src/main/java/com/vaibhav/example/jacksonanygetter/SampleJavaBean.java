package com.vaibhav.example.jacksonanygetter;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonGetter;

import java.util.HashMap;
import java.util.Map;

public class SampleJavaBean {
    public String name;
    private Map < String, String > properties;

    public SampleJavaBean() {
        properties = new HashMap < String, String > ();
    }

    public SampleJavaBean(final String name) {
        this.name = name;
        properties = new HashMap< String, String >();
    }

   @JsonGetter
    public String getName(){
        return name;
    }

    @JsonAnySetter
    public void add(final String key, final String value) {
        properties.put(key, value);
    }

    @JsonAnyGetter
    public Map< String, String > getProperties() {
        return properties;
    }
}
