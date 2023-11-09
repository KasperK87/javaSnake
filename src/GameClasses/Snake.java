package GameClasses;
import processing.core.PVector;
import java.util.ArrayList;

public class Snake {
    //liste over alle punkter vores slange optager
    ArrayList<PVector> longSnake; 
    
    //bestemmer hvor lang vores slange skal være,
    //før vi sletter den ældste del af slangen.
    int snakeSize;

    //bestemmer hvilken retning slangen bevæger sig
    PVector dir;

    public Snake() {
        longSnake = new ArrayList<PVector>();
        longSnake.add(new PVector(9, 9));
        snakeSize = 2;
        dir = new PVector(9, 9);
    }

    public void update() {
        PVector head = longSnake.get(longSnake.size() - 1);

        //tilføjer et nyt punkt til slangen
        longSnake.add(new PVector(head.x + dir.x, head.y + dir.y));

        //kollision detection for vores slange,
        //her tjekker vi om hovedt at vores slange
        //rammer sig selv
        for(int i = longSnake.size()-1; i >= 0; i--){
        
        }
    

        //sletter det ældste punkt i slangen
        if (longSnake.size() > snakeSize) {
            //longSnake.remove(0);
        }
    }
}

