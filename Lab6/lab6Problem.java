import java.util.Random;

public class lab6Problem {
    public static void main(String[] args) {
        char mistake[] = { 'a', 'c', 't', 'k', 'n', 'u', 'r', 'l' };// we will have only 8 types of typos
        Random rand = new Random();
        int letter = 0, mis = 0;
        String str = "I will never spam my friends again";// this is our main string
        for (int i = 0; i < 100; i++) {
            letter = rand.nextInt(str.length());
            mis = rand.nextInt(mistake.length);
            String newStr = str.replace(str.charAt(letter), mistake[mis]);
            if (str.charAt(letter) == ' ')// I decided to make the output more beautiful, so I except the spaces inside
                continue;
            else
                System.out.println((i + 1) + ") " + newStr);
        }
    }
}

// Student Daniil Radevich