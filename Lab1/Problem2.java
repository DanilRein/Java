import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles and I'll covert it into kilometers");
        double mile = input.nextInt(); // to get decimal number I'm using "double"
        double kilometers = mile * 1.609; // counts are based on the fact that 1m=1.609km
        System.out.println(mile + " miles is equel to " + kilometers + " kilometers");// output

    }

}
// student - Daniil Radevich