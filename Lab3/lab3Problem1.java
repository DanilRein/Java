
// Lab3 Problem1
import java.util.Scanner;

public class lab3Problem1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer");
        int num = scan.nextInt();
        if (num < 0) {
            System.out.println("Error");
        } else {
            if (num == 0) {
                System.out.println("Result: 0");
            } else {
                int i = 0;
                int sum = 0;
                if (num % 2 == 0) {
                    num--;
                }
                for (; num >= 0; num -= 2) {
                    sum += num;
                    i++;
                }
                int aver = sum / i;
                System.out.println("Result: " + aver);
            }
        }
    }
}

// student Daniil Radevich
