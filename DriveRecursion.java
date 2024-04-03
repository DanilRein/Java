import java.util.Arrays;

public class Sorting {
   public static void main(String[] args) {
      int[] arr = { 43, 323, 21, 1, 23, 112 };
      arr = bubble(arr);
      Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
   }
  
   public static int[] bubble(int[] arr) {
      int n = arr.length;
      if (n <= 1) {
         return arr;
      }
      int[] sorted = Arrays.copyOf(arr, n);
      for (int i = 0; i < n-1; i++) {
         for (int j = 0; j < n-i-1; j++) {
            if (sorted[j] > sorted[j+1]) {
               int temp = sorted[j];
               sorted[j] = sorted[j+1];
               sorted[j+1] = temp;
            }
         }
      }
      return sorted;
   }
}

