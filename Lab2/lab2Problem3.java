import java.util.Scanner;

public class lab2Problem3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter subtotal $");
        Double sub = input.nextDouble();
        System.out.println("Enter gratuity");
        Double gr = input.nextDouble();
        Double rGr = sub * gr * 0.01;
        Double total = rGr + sub;
        System.out.println("The gratuity is $" + rGr + "; The total is $" + total);

    }
}
