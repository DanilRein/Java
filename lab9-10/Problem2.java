import java.util.Scanner;
import java.util.ArrayList;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arrCheckEven = new ArrayList<Integer>();
        System.out.println("Enter the integer \"m\"");
        int m = scan.nextInt();
        for (int i = 2; m != 1; i++) {
            if (m % i == 0) {
                m /= i;
                arr.add(i);
                i--;
            }
        }
        int n = 1;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++)
                if (arr.get(j) == arr.get(i))
                    arrCheckEven.add(arr.get(j));
            if (arrCheckEven.size() % 2 == 0)
                continue;
            else
                n *= arr.get(i);
            i += arrCheckEven.size() - 1;
            arrCheckEven.clear();
        }
        System.out.println("n = " + n);

    }
}
// student Daniil Radevich