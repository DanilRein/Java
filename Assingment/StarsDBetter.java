public class StarsDBetter {
    public static void main(String[] args) {
        int c = 8;// how long our string is
        int mid = c / 2;// middle of our string
        int decrMid = mid;// middle of every our string that will be first decreased
        int incrMid = mid;// middle of every our string that will be first increased
        for (int i = 0; i <= c; i++) {
            if (i < mid) {
                for (int j = 0; j <= c; j++) {
                    if (j < decrMid || j > incrMid) {
                        System.out.print(" ");
                    } else
                        System.out.print("*");
                }
                decrMid--;
                incrMid++;
            } else {// we will rotate our function. Decreased and increased values will be mixed up
                for (int j = 0; j <= c; j++) {
                    if (j < decrMid || j > incrMid) {
                        System.out.print(" ");
                    } else
                        System.out.print("*");
                }
                decrMid++;
                incrMid--;
            }
            System.out.println();
        }
    }
}