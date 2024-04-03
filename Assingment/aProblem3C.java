//Daniil Radevich|ID:19426|Introduction to Programming|Wroclaw Business Academy
// Assignment 1, Problem 3, C

public class aProblem3C {

    public aProblem3C() {
        int s = 10;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++)
                if (j < i) {
                    System.out.print(" ");
                } else
                    System.out.print("*");
            System.out.println();
        }
    }
}