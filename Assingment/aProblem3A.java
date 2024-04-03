//Daniil Radevich|ID:19426|Introduction to Programming|Wroclaw Business Academy
// Assignment 1, Problem 3, A

public class aProblem3A {

    public aProblem3A() {
        int s = 10;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++)
                if (j >= i) {
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}
