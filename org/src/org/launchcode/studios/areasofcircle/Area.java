package org.launchcode.studios.areasofcircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius:");
        long radius = input.nextLong();
        double  area=(3.14*radius*radius) ;
        System.out.println("Area of Circle is: " + area);
    }


}



