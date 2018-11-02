package com.vinodh;

public class Main {

    public static void main(String[] args) {

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getCreditlimit());

        VipPerson person2 = new VipPerson("bob", 2500.00);
        System.out.println(person2.getEmailAddress());

        VipPerson person3 = new VipPerson("tim", 2000.00, "tim@gmail.com");
        System.out.println(person3.getName());

    }
}
