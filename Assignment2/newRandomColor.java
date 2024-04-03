import java.awt.Color; //importing Color util
import java.util.Random; //importing the Random util

public class newRandomColor {
    public Color randomColor() {

        Random rand = new Random();

        int red = rand.nextInt(256); // getting random value of red integer
        int green = rand.nextInt(256); // getting random value of green integer
        int blue = rand.nextInt(256); // getting random value of red integer

        Color col = new Color(red, green, blue);// creating the Color with the parameters of our integers

        return col;// returning the object
    }
}
