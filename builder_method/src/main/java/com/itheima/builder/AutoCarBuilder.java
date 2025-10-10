package com.itheima.builder;

import com.itheima.product.Car;

public class AutoCarBuilder implements Builder {
    private Car car;

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int number) {
        System.out.println("AutoCarBuilder setSeats: " + number);
        car.setSeats(number);
    }

    @Override
    public void setEngine(String engine) {
        System.out.println("AutoCarBuilder setEngine: " + engine);
        car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        System.out.println("AutoCarBuilder setTripComputer: " + hasTripComputer);
        car.setTripComputer(hasTripComputer);
    }

    @Override
    public void setGPS(boolean hasGPS) {
        System.out.println("AutoCarBuilder setGPS: " + hasGPS);
        car.setGPS(hasGPS);
    }

    @Override
    public Car getResult() {
        return car;
    }
}
