import java.util.Arrays;

public class Sort {
    public void SortNow(int arr[]) {
        int help = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    help = arr[i];
                    arr[i] = arr[j];
                    arr[j] = help;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
