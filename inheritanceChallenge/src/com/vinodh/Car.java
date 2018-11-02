package com.vinodh;

public class Car extends vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }
    public void changeGear(int currentGear){
        this.currentGear=currentGear;
        System.out.println("currentgear changed to "+this.currentGear);
    }
    public void changevelocity(int speed,int direction){
        System.out.println("velocity is being changed to "+ speed+" and direction to "+direction);
        move(speed,direction);
    }
}
