package com.vinodh;

public class outlander extends Car {
    private int roadServiceMonths;

    public outlander(int roadServiceMonths) {
        super("outlander","4wd",5,5,6,false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void acceleration(int rate){

        int newVelocity = getCurrentvelocity()+rate;
        if(newVelocity == 0){
            stop();
            changeGear(1);
        }else if(newVelocity >0 && newVelocity <=10) {
            changeGear(1);
        } else if(newVelocity >10 && newVelocity <=20) {
            changeGear(2);
        } else if(newVelocity >20 && newVelocity <=30) {
            changeGear(3);
        } else {
            changeGear(4);
        }
        if(newVelocity>0){
            changevelocity(newVelocity,getCurrentdirection());
        }
    }
}
