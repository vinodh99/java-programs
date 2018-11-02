package com.vinodh;

public class Bedrooms {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private BED bed;
    private Lamp lamp;
    private ceiling ceiling;

    public Bedrooms(String name, Wall wall1, Wall wall2, BED bed, Lamp lamp, ceiling ceiling) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.bed = bed;
        this.lamp = lamp;
        this.ceiling = ceiling;
    }

    public Lamp getLamp() {
        return lamp;
    }
    public void makeBed(){
        System.out.println("bedroom making bed");
        bed.make();
    }
}

