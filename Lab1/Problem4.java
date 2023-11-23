import java.util.Scanner;

public class Problem4 {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter starting odometr reading");
        int odStart = input.nextInt();//first of all geting information from user about the distance and refused fuel
        System.out.println("Enter ending odometr reading");
        int odEnd = input.nextInt(); 
        System.out.println("Enter the amount of refused gas");
        int gas=input.nextInt();
        int dist=odEnd-odStart; //calculating the distance
        int fCons = gas*100/dist;// fCons- fuel consuption; to get l/100km we have to multiply our gas by 100km and then divide by the distance
        System.out.println("Your fuel consumption: " + fCons + " l/100km");//output
    }
}
//student - Daniil Radevich