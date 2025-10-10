package com.itheima.builder;

import com.itheima.product.Car;

public class ManualCarBuilder implements Builder {
    private Car car;

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int number) {
        System.out.println("ManualCarBuilder setSeats: " + number);
        car.setSeats(number);
    }

    @Override
    public void setEngine(String engine) {
        System.out.println("ManualCarBuilder setEngine: " + engine);
        car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean hasTripComputer) {
        System.out.println("ManualCarBuilder setTripComputer: " + hasTripComputer);
        car.setTripComputer(hasTripComputer);
    }

    @Override
    public void setGPS(boolean hasGPS) {
        System.out.println("ManualCarBuilder setGPS: " + hasGPS);
        car.setGPS(hasGPS);
    }

    @Override
    public Car getResult() {
        return car;
    }
}
