package com.csit.ramesh.csit;

import java.io.Serializable;

/**
 * Created by Ramesh on 2/25/2017.
 */
public class Retrieve implements Serializable {
    public String name;

    public Retrieve() {
    }

    public Retrieve(String name) {
        this.name = name;
    }
}
