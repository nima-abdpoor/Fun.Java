package com.company.Reflection;

import jdk.jfr.Category;
import jdk.jfr.Enabled;

import java.lang.annotation.Target;

@Enabled
public class Circle {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Deprecated
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter() {
        return Math.PI * this.radius * 2;
    }
}
