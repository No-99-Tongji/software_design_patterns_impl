package com.itheima.director;

import com.itheima.builder.Builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public void constructSUV() {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine("SUV Engine");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void constructCityCar() {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("City Car Engine");
        builder.setTripComputer(false);
        builder.setGPS(true);
    }
}
