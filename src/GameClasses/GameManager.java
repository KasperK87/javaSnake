package GameClasses;

import processing.core.PVector;

public class GameManager {
    int[][] grid;

    Snake snake;
    Food food;
   
    public GameManager() {
        grid = new int[19][19];
        food = new Food();
        snake = new Snake();
    }

    public void run() {
        //we make sure the grid is empty
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                grid[i][j] = 1;
            }
        }
        grid[(int)food.getX()][(int)food.getY()] = 2;
        //we render the snake
        snake.update();
        for (int i = 0; i < snake.longSnake.size(); i++) {
            PVector pos = snake.longSnake.get(i);
            if (pos.x >= 0 && pos.x < 19 && pos.y >= 0 && pos.y < 19)
                grid[(int)pos.x][(int)pos.y] = 0;
        }

        //we check if the snake has eaten the food
        if (snake.longSnake.get(snake.longSnake.size() - 1).x == food.getX() && 
            snake.longSnake.get(snake.longSnake.size() - 1).y == food.getY()) {
                
            snake.eat();
            food.spawn();
        } 
    }

    public int[][] getGrid() {
        return grid;
    }

    public void update() {
        snake.update();
    }

    public void setDirection(int dir) {
        snake.setDirection(dir);
    }
}
