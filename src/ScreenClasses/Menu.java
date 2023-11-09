package ScreenClasses;

import processing.core.*;
import processing.core.PVector;

 public class Menu extends Screen {
    PApplet p;  
    ScreenManager sm;  

    StartButton startButton;

    public Menu(ScreenManager sm) {
        this.p = sm.p;
        this.sm = sm;        
        startButton = new StartButton(sm, new PVector(p.width/2-50, p.height/2-25), new PVector(100, 50));
    }

     public void update() {
        startButton.update();
     }

     public void render() {
        startButton.render();
     }
     
 }