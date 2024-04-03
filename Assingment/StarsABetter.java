public class StarsABetter {
    
    public static void main(String[] args) {
        String star = "*";
        int amount = 8;
        for (int k = 0; k < amount-1; k++) {
            star+="*";
        }
        for (int i = 0; i < star.length(); i++) {
            System.out.println(star.substring(i));
        }
    }
}
