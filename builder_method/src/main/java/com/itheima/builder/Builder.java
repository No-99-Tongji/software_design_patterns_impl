package com.itheima.builder;

import com.itheima.product.Car;

public interface Builder {
    void reset();
    void setSeats(int number);
    void setEngine(String engine);
    void setTripComputer(boolean hasTripComputer);
    void setGPS(boolean hasGPS);
    Car getResult();
}
