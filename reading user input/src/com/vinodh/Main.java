package com.vinodh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("enter the year of birth of the user");
        String year = scanner.nextLine();

        System.out.println("you have entered "+ year);


        System.out.println("enter the name of the user");
        String name = scanner.nextLine();
        System.out.println("you have entered " + name);

        scanner.close();

    }
}
