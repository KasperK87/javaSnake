package GameClasses;

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
        // we make sure the grid is empty
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                grid[i][j] = 1;
            }
        }
        grid[(int) food.getX()][(int) food.getY()] = 2;
        // we render the snake
        snake.update();
    }

    public int[][] getGrid() {
        return grid;
    }

    public void update() {
        snake.update();
    }

}
