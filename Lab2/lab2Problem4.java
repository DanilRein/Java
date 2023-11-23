import java.util.Scanner;

public class lab2Problem4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter beginning velocity in m/s");
        Double v0 = scan.nextDouble();
        System.out.println("Enter ending velocity in m/s");
        Double v1 = scan.nextDouble();
        System.out.println("Enter t in seconds");
        Double t = scan.nextDouble();
        Double averV = (v1 - v0) / t;
        System.out.println("The average acceleration is " + averV + " m/s^2");

    }
}
