//Lab 8, Problem 2, class
import java.lang.Math;

public class Circle {
    private double radius;
    private final double Pi = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(int newRadius) {
        this.radius = newRadius;
    }

    public double Circumference() {
        return 2 * Pi * this.radius;
    }

    public double circleArea() {
        return Pi * Math.pow(this.radius, 2);
    }

    public String toString() {
        return "Radius = " + this.radius + ";\tCircumference = " + Circumference() + ";\tArea = " + circleArea();
    }

}
// student: Daniil Radevich