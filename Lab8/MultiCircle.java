//Lab 8, Problem 2, driver

public class MultiCircle {
    public static void main(String[] args) {

        Circle circle = new Circle(5);

        System.out.println("Radius = " + circle.getRadius());
        System.out.println("Circumference = " + circle.Circumference());
        System.out.println("Circle area = " + circle.circleArea());
        System.out.println(circle);

        System.out.println("\nUpdated data:\n");
        circle.setRadius(10);

        System.out.println("Radius = " + circle.getRadius());
        System.out.println("Circumference = " + circle.Circumference());
        System.out.println("Circle area = " + circle.circleArea());
        System.out.println(circle);

    }
}
// student: Daniil Radevich