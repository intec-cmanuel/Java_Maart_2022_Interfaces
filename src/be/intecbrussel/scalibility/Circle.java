package be.intecbrussel.scalibility;

public class Circle implements Minimizable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void scaleUp(int percentGrowth) {
        this.radius = this.radius + (this.radius * percentGrowth)/100;
    }

    @Override
    public void scaleDown(int percentGrowth) {
        this.radius = this.radius - (this.radius * percentGrowth)/100;
    }

    @Override
    public void minimize() {
        this.radius = 0.1;
    }
}
