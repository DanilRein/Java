import java.util.Scanner;
import java.lang.Math;

public class lab2Problem1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter length");
        double l = input.nextDouble();

        System.out.println("Enter radius");
        double r = input.nextDouble();

        double area = r * r * Math.PI;

        double volume = area * l;

        System.out.println("Area = " + area + "; Volume = " + volume);

    }
}
