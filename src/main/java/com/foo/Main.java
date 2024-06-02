package com.foo;

public class Main {
    public static void main(String[] args) {
        // This is just to demonstrate parameterization of Sphere
        if (args.length < 1) {
            System.out.println("This project is used to demonstrate the parameterization of a method to" +
                " calculate the volume of a sphere, so it expects one argument. Please enter a radius to" +
                " use for the calculation.");
            System.exit(1);
        }

        double radius = 0;
        try {
            radius = Double.parseDouble(args[0]);
        } catch (NumberFormatException nfe) {
            System.out.println("The parameter entered was not a number. Please try again!");
            System.exit(1);
        }

        ThreeDimShape sphere = new Sphere();
        double volume = sphere.calculateVolume(radius);
        
        System.out.printf("The volume of the sphere is: " + volume);
    }
}
