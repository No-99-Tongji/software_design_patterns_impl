package com.itheima;


import com.itheima.factory.ClassicFactory;
import com.itheima.factory.ModernFactory;

public class Main {
    static void main() {
        System.out.println("Abstract Factory Pattern\n");
        // 现代风格家具
        ModernFactory modernFactory = new ModernFactory();
        // 现代椅子
        modernFactory.createChair().sitOn();
        // 现代沙发
        modernFactory.createSofa().lieOn();
        // 现代茶几
        modernFactory.createTable().putOn();


        // 经典风格家具
        ClassicFactory classicFactory = new ClassicFactory();
        // 经典椅子
        classicFactory.createChair().sitOn();
        // 经典沙发
        classicFactory.createSofa().lieOn();
        // 经典茶几
        classicFactory.createTable().putOn();
    }
}
