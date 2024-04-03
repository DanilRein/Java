//Daniil Radevich|ID:19426|Introduction to Programming|Wroclaw Business Academy
// Assignment 1, Problem 1

import java.util.Scanner;

public class aProblem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of money in zl ");
        double cash = input.nextDouble();
        int hundred, fifty, twenty, ten, five, two, one, fiftyGr, twentyGr, tenGr, fiveGr, twoGr, oneGr;
        hundred = (int) cash / 100;// counting
        fifty = (int) cash % 100 / 50;
        twenty = (int) cash % 100 % 50 / 20;
        ten = (int) cash % 100 % 50 % 20 / 10;
        five = (int) cash % 50 % 20 % 10 / 5;
        two = (int) cash % 50 % 20 % 10 % 5 / 2;
        one = (int) cash % 50 % 20 % 10 % 5 % 2;
        cash *= 100;
        cash %= 100;
        fiftyGr = (int) cash / 50;
        twentyGr = (int) cash % 50 / 20;
        tenGr = (int) cash % 50 % 20 / 10;
        fiveGr = (int) cash % 50 % 20 % 10 / 5;
        twoGr = (int) cash % 50 % 20 % 10 % 5 / 2;
        oneGr = (int) cash % 50 % 20 % 10 % 5 % 2;

        double bills[] = { hundred, fifty, twenty, ten, five, two, one, fiftyGr, twentyGr, tenGr, fiveGr, twoGr,
                oneGr };// for the output loop
        String billStr[] = { "100zl", "50zl", "20zl", "10zl", "5zl", "2zl", "1zl", "50Gr", "20Gr", "10Gr", "5Gr", "2Gr",
                "1Gr" };// for the output loop
        for (int i = 0; i < bills.length; i++) {// output loop
            if (bills[i] != 0)// delete other useless data
                System.out.println("x" + (int) bills[i] + " of " + billStr[i]);
        }
    }
}
