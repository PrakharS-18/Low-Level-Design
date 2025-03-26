package LLD.MachineCodingExamples.SnakeAndLadder;

import java.util.List;
import java.util.Map;
import java.util.Queue;

public class GameBoard {
    int width;
    int height;
    Queue<Player> players;
    List<Snake> snakes;
    List<Ladder> ladders;
    Map<String, Integer> currentPosition;

    /* if we have to provide the multiple constructor we can use builder pattern -> "LOMBOOK" types */
    GameBoard(int w, int h, Queue<Player> p, List<Snake> s, List<Ladder> l, Map<String,Integer> cp) {
        width = w;
        height = h;
        players = p;
        snakes = s;
        ladders = l;
        currentPosition = cp;
    }

}
