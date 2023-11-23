import java.util.Scanner;

public class lab2Problem2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integer between 0 and 1000");
        int num = input.nextInt();
        int u = num % 10;
        int t = (num % 100 - u) / 10;
        int h = num / 100;
        int sum = h + t + u;
        System.out.println("The result is " + sum);
    }
}
