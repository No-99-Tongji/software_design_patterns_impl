package com.itheima;

public class SingleClass {
    private static SingleClass instance;

    private SingleClass() {}
    public static SingleClass getInstance() {
        if (instance == null) {
            instance = new SingleClass();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
