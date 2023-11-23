import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds and I'll covert it into hours, minutes and seconds");
        int allSec = input.nextInt();
        int hour = allSec / 3600; // calculating hours
        int minSec = allSec % 3600; // minSec - the rest of seconds we need to count the minutes and then the
                                    // seconds
        int min = minSec / 60;
        int sec = minSec % 60;// calculating seconds
        System.out.println(allSec + "sec = " + hour + " hours " + min + " minutes " + sec + " seconds");// output
    }

}
// student - Daniil Radevich
