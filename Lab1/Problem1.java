import java.util.Scanner;

public class Problem1 {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers and I'll display their average");
        int a = input.nextInt(); //getting the information from user
        int b = input.nextInt();
        int c = input.nextInt();
        int aver = (a+b+c)/3; //calculating the average
        System.out.println("The averege is: "+ aver); //output
    }

}
//student - Daniil Radevich