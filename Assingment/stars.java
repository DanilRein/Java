import java.util.Scanner;
import java.util.Stack;

public class stars {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        String other = "What other task do you want to check? (Please, enter the letter from a to d)\nEnter \"exit\" to stop the program";
        System.out.println(
                "What task do you want to check? (Please, enter the letter from \"a\" to \"d\")\nEnter \"exit\" to stop the program");
        boolean check = true;
        while (check == true) {
            String problem = sc.nextLine();
            stack.push(problem);
            switch (problem) {
                case "a":
                    aProblem3A a = new aProblem3A();
                    System.out.println(other);
                    break;
                case "b":
                    aProblem3B b = new aProblem3B();
                    System.out.println(other);
                    break;
                case "c":
                    aProblem3C c = new aProblem3C();
                    System.out.println(other);
                    break;
                case "d":
                    aProblem3D d = new aProblem3D();
                    System.out.println(other);
                    break;
                case "exit":
                    System.out.println("Goodbye!");
                    check = false;
                    break;
                default:
                    System.out.println(
                            "Error! Please, enter the letter from \"a\" to \"d\"\nEnter \"exit\" to stop the program");
                    break;

            }
        }
        System.out.println("Options were used: " + stack);

    }

}