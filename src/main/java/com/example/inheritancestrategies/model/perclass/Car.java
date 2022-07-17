package com.example.inheritancestrategies.model.perclass;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Car extends Vehicle {
    @Column(nullable = true)
    private boolean hasAirConditioner;
    @Column(nullable = true)
    private boolean hasSunRoof;

    public boolean isHavingAirConditioner() {
        return hasAirConditioner;
    }

    public void setHavingAirConditioner(boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
    }

    public boolean isHavingSunRoof() {
        return hasSunRoof;
    }

    public void setHavingSunRoof(boolean hasSunRoof) {
        this.hasSunRoof = hasSunRoof;
    }
}