import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scan.nextInt();
        Random rand = new Random();
        ArrayList<Integer> row = new ArrayList<Integer>();
        ArrayList<Integer> col = new ArrayList<Integer>();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(2);
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        int sumRow = 0, sumCol = 0;
        for (int i = 0; i < n; i++) {
            sumRow = 0;
            sumCol = 0;
            for (int j = 0; j < n; j++) {
                sumRow += matrix[i][j];
                sumCol += matrix[j][i];
            }
            row.add(sumRow);
            col.add(sumCol);
        }
        int checkRow = 0, checkCol = 0, mostOnesRow = 0, mostOnesCol = 0;
        for (int j = 0; j < row.size(); j++) {
            if (row.get(j) > checkRow) {
                checkRow = row.get(j);
                mostOnesRow = j + 1;
            }
            if (col.get(j) > checkCol) {
                checkCol = col.get(j);
                mostOnesCol = j + 1;
            }
        }
        System.out.println("The number of the row with the most ones is " + mostOnesRow
                + "\nThe number of the column with the most ones is " + mostOnesCol);

    }
}
//student Daniil Radevich