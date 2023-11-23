
// Lab3 Problem4
import java.util.Scanner;

public class lab3Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char let[] = { 'e', 't', 'n' }; // creating for the further recursions and comparing
        String[] str = new String[3];// creating array for the stings that will be entered
        int e = 0, t = 0, n = 0;
        int letNum[] = { e, t, n };
        for (int l = 0; l < str.length; l++) { // recursion made to input the strings
            System.out.println("Enter the " + (l + 1) + " string");
            str[l] = scan.nextLine();
        }
        for (int i = 0; i < str.length; i++) { // recursion for iterating of the strings
            for (int k = 0; k < str[i].length(); k++) { // recursion for comparing
                if (str[i].charAt(k) == let[i])
                    letNum[i]++;// count the number of letters
            }
        }
        for (int s = 0; s < letNum.length; s++)// recursion for the output
            System.out.println(letNum[s] + " times letter '" + let[s] + "' in the " + (s + 1) + " string");

    }
}

// student Daniil Radevich