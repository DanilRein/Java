//Daniil Radevich|ID:19426|Introduction to Programming|Wroclaw Business Academy
// Assignment 1, Problem 3, B

public class aProblem3B {

    public aProblem3B() {
        int s = 10;
        for (int i = 0; i < s; i++) {
            for (int k = 0; k < s; k++) {
                if (k < s - (1 + i))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}