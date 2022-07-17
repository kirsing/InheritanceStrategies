package com.example.inheritancestrategies.model.perclass;


import javax.persistence.Entity;

@Entity
public class Truck extends Vehicle {

    private boolean hasTrailer;

    public boolean isHavingTrailer() {
        return hasTrailer;
    }

    public void setHavingTrailer(boolean hasTrailer) {
       this.hasTrailer = hasTrailer;
    }
}
