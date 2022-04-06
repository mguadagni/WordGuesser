import java.util.Random;

public class Randomizer {

    public static Random rand = new Random();

    public static int getRandInt (int upperLim) {

        return rand.nextInt(upperLim);

    }

}
