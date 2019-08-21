package com.hendyirawan.wisatadunia.core;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String id;
    private String name;
    private List<City> cities = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCities() {
        return cities;
    }
}
