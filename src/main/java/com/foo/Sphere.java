package com.foo;

public class Sphere implements ThreeDimShape {   
    @Override
    public double calculateVolume(double radius) {
        double vol = (4.00 / 3.00) * Math.PI * Math.pow(radius, 3);
        return vol;
    }

    @Override
    public double calculateArea(double radius) {
        //implement method for calculating area of sphere
        return 0f;
    }
}
