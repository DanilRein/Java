public class lab5Problem1 {
    public static void main(String[] args) {
        double tuition = 10000;
        double tuition10 = 0;
        double total = 0;
        for (int i = 0; i < 14; i++) {
            tuition += 0.05 * tuition;
            if (i + 1 == 10)
                tuition10 = tuition;
            if (i + 1 > 10) {//Hopefully we will not consider the 10th year:)
                total += tuition;
            }
        }
        System.out.println("Total from 10 to 14 years: " + total + "zl" + "\nTuition in 10 years: " + tuition10 + "zl");
    }
}

//student Daniil Radevich
