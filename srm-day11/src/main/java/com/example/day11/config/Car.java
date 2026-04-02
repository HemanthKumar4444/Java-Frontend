package com.example.day11.config;

public class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        System.out.println("Car bean created");
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println("Driving the car...");
    }
}
