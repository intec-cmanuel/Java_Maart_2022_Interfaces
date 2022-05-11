package be.intecbrussel.splitinterfaces;

import be.intecbrussel.splitinterfaces.Scalable;

public class Circle implements Scalable {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void scaleUp() {
        System.out.println("BIGGER");
    }

    @Override
    public void scaleDown() {
        System.out.println("SMALLER");
    }
}
