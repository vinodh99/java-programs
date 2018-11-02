package com.vinodh;

public class Main {

    public static void main(String[] args) {

        Wall wall1=new Wall("west");
        Wall wall2=new Wall("east");

        ceiling Ceiling = new ceiling(12,55);

        BED bed=new BED("classic", 4,5,6,3);

        Lamp lamp = new Lamp("artist",true, 5);

        Bedrooms bedroom=new Bedrooms("vinodh's room", wall1, wall2, bed,lamp, Ceiling);
        bedroom.makeBed();


    }
}
