import java.util.Scanner;

public class lab5Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor = 0;
        System.out.println("Enter two integers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (n1 < n2) {//n2 should be less than n1, so we're adjusting that
            int subN = n1;
            n1 = n2;
            n2 = subN;
        }
        for (divisor = n2; divisor > 0; divisor--) {
            if (n2 % divisor == 0 && n1 % divisor == 0) {
                break;
            }
        }
        System.out.println("Then GCD is " + divisor);
    }

}

//student Daniil Radevich