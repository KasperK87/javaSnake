import processing.core.*;
import ScreenClasses.*;

public class App extends PApplet {
    ScreenManager game;

    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void settings() {
        size(190, 190);

        game = new ScreenManager(this);
    }

    public void draw() {
        background(0);

        game.run();
    }
}
