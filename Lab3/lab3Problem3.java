
// Lab3 Problem3
import java.util.Random; //importing the class Random

public class lab3Problem3 {
    public static void main(String[] args) {
        String week[] = { "mo", "tu", "we", "th", "fr" };// creating array for each weekday
        Random rand = new Random(); // making the instance of the class Random
        for (int k = 0; k < week.length; k++) { // recursion for printing every row
            System.out.print(week[k] + "\t");// \t for tabulation
            for (int i = 0; i < 10; i++) // recursion for printing every number of hours
                System.out.print(rand.nextInt(13) + "h ");// I guess that max hours per day - 12h thats why I use 13
                                                          // like a bound
            System.out.println("\n");// \n for row division
        }

    }
}

// student Daniil Radevich