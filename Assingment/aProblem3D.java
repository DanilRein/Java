//Daniil Radevich|ID:19426|Introduction to Programming|Wroclaw Business Academy
// Assignment 1, Problem 3, D

public class aProblem3D {
    public aProblem3D() {

        int s = 9;// how long our string is
        int mid = s / 2;// middle of our string
        int decrMid = mid;// middle of every our string that will be first decreased
        int incrMid = mid;// middle of every our string that will be first increased
        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j <= s; j++) {
                if (j < decrMid || j > incrMid) {
                    System.out.print(" ");
                } else
                    System.out.print("*");
            }
            decrMid--;
            incrMid++;
            System.out.println();
        }
        for (int i = 0; i <= mid; i++) {// we will rotate our function. Decreased and increased values will be mixed up
            for (int j = 0; j <= s; j++) {
                if (j <= decrMid || j >= incrMid) {
                    System.out.print(" ");
                } else
                    System.out.print("*");
            }
            decrMid++;
            incrMid--;
            System.out.println();
        }
    }
}