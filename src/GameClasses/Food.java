package GameClasses;
import java.util.Random;

public class Food {
    float x, y;

    Random rand = new Random();

    public Food() {
        x = rand.nextInt(19);
        y = rand.nextInt(19);
    }

    public void spawn() {
        x = rand.nextInt(19);
        y = rand.nextInt(19);
    }
}
