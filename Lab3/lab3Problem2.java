
// Lab3 Problem2
import java.util.Scanner;

public class lab3Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = scan.nextLine();

        for (int i = 0; i < str.length(); i++) { // recursion for printing every character of string
            System.out.println(str.charAt(i)); // I use charAt to iterate over each character in the entered string
        }
    }
}

// student Daniil Radevich