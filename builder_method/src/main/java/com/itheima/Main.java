package com.itheima;

import com.itheima.builder.AutoCarBuilder;
import com.itheima.director.Director;
import com.itheima.product.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Builder Method Pattern\n");
        AutoCarBuilder builder = new AutoCarBuilder();
        Director director = new Director(builder);

        director.constructSUV();
        Car car1 = builder.getResult();
        System.out.println(car1+"\n");

        director.constructCityCar();
        Car car2 = builder.getResult();
        System.out.println(car2+"\n");

        director.changeBuilder(new AutoCarBuilder());
        director.constructSUV();
        Car car3 = builder.getResult();
        System.out.println(car3+"\n");

        director.constructCityCar();
        Car car4 = builder.getResult();
        System.out.println(car4+"\n");
    }
}
