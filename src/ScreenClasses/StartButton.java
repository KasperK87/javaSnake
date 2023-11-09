package ScreenClasses;
import processing.core.*;

public class StartButton {
    PApplet p;
    ScreenManager sm;
    PVector pos;
    PVector size;

    public StartButton(ScreenManager sm, PVector pos, PVector size) {
        this.p = sm.p;
        this.sm = sm;
        this.pos = pos;
        this.size = size;
    }

    public void update() {
        if (p.mouseX > pos.x && p.mouseX < pos.x + size.x && p.mouseY > pos.y && p.mouseY < pos.y + size.y) {
            p.fill(255, 0, 0);

            if (p.mousePressed) {
                sm.currentScreen = new Game(sm);
            }

        } else {
            p.fill(255);
        }
    }

    public void render() {
        p.textAlign(PApplet.CENTER, PApplet.CENTER);
        p.rect(pos.x, pos.y, size.x, size.y);
        p.fill(0);
        p.textSize(16);
        p.text("START", pos.x + size.x / 2, pos.y + size.y / 2);
    }
}
