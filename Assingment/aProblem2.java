//Daniil Radevich|ID:19426|Introduction to Programming|Wroclaw Business Academy
// Assignment 1, Problem 2

import java.util.Random;

public class aProblem2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int h = rand.nextInt(9, 31);
        int b = rand.nextInt(9, 31);
        int a = rand.nextInt(9, 31);
        int area = b * h;
        int per = 2 * (a + b);
        System.out.println("Height = " + h + "\nBase = " + b + "\nSide = " + a);
        System.out.println("Area: " + area + "\nPerimeter: " + per);
    }
}
