package ScreenClasses;

import GameClasses.*;
import processing.core.*;

public class Game extends Screen{
    PApplet p;
    ScreenManager sm;

    GameManager gm;
    int[][] grid;

    public Game(ScreenManager sm) {
        this.p = sm.p;
        this.sm = sm;
        this.gm = new GameManager();
        grid = gm.getGrid();
    }

    public void update() {
        System.out.println("Game update");
        gm.run();
    }

    public void render() {
        System.out.println("Game render");
        p.background(255);
        for (int i = 0; i < 19; i++){
            for (int j = 0; j < 19; j++){
                if (grid[i][j] == 0){
                    p.fill(0);
                } else if (grid[i][j] == 1){
                    p.fill(255);
                } else if (grid[i][j] == 2){
                    p.fill(255, 0, 0);
                }
                p.rect(i*10, j*10, 10, 10);
            }
        }
    }  
    
}
