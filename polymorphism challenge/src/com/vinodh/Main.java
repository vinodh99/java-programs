package com.vinodh;


class Car {
    private boolean engine;
    private  int cylinders;
    private int wheels;
    private String name;


    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }
    public String startengine(){
        return "engine is started";
    }
    public String accelerating(){
        return "accelerating the car";
    }
    public String brake(){
        return "brakes applied";
    }
}

class mitsubushi extends Car{
    public mitsubushi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startengine() {
        return getClass().getSimpleName()"mitsibushi engine is started";
    }

    @Override
    public String accelerating() {
        return "accelerating the misib";
    }

    @Override
    public String brake() {
        return "brakes applied for mitsi";
    }
}




public class Main {

    public static void main(String[] args) {


        Car car = new Car(8, "base car");
        System.out.println(car.startengine());
        System.out.println(car.accelerating());
        System.out.println(car.brake());


        mitsubushi carmitsi = new mitsubushi()

    }
}
