package LLD.MachineCodingExamples.SnakeAndLadder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class GameMain {
    public static void main(String[] args) {
        configGame();
    }

    private static void configGame() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the height of the board");
            int h = Integer.parseInt(br.readLine());
            System.out.println("Enter the width of the board");
            int w = Integer.parseInt(br.readLine());

            Player p1 = new Player(1, "Prakhar");
            Player p2 = new Player(2, "Singh");

            Queue<Player> pQueue = new LinkedList<>();
            pQueue.add(p1);
            pQueue.add(p2);

            Ladder l1 = new Ladder(7, 21);
            Ladder l2 = new Ladder(9, 16);
            Ladder l3 = new Ladder(23, 27);

            List<Ladder> ladders = new ArrayList<>(List.of(l1,l2,l3));

            Snake s1 = new Snake(28, 13);
            Snake s2 = new Snake(18, 3);
            Snake s3 = new Snake(25,19);

            Dice dice = new Dice(2);

            List<Snake> snakes = new ArrayList<>(List.of(s1,s2,s3));

            Map<String, Integer> cop = new HashMap<>(Map.of(p1.getName(), 1, p2.getName(), 1));

            playGame(h*w, snakes, ladders, cop, pQueue, dice);
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void playGame(int win, List<Snake> snakes, List<Ladder> ladders,
     Map<String, Integer> cop, Queue<Player> players, Dice dice) {
        System.out.println("To win reach first at :" + win);
        boolean isPlay = true;
        while(isPlay) {

            /* S1: to get the player, whose turn is to roll the dice */
            Player p = players.remove();

            /* S2: Roll the dice for current player */
            System.out.println("Roll the dice for: "+ p.getName());
            int move = dice.rollDice();
            System.out.println("The next move is: "+move);
            int currentPosition = cop.get(p.getName());

            /* S3: when you are near end and sum of move is greater than win */
            if((currentPosition+move)<=win) {
                currentPosition += move;
            }
            else{
                System.out.println("The move is not allowed because , the total is greater than win");
            }

            /* S4: to check for snake in path */
            for (Snake snake : snakes) {
                if(snake.startingPoint == currentPosition) {
                    currentPosition = snake.endingPoint;
                }
            }

            /* S5: to check for ladder in path */
            for (Ladder ladder : ladders) {
                if(ladder.startingPoint == currentPosition) {
                    currentPosition = ladder.endingPoint;
                }
            }

            /* S6: update the current position to the map, maintaing the current position of players */
            cop.put(p.getName(), currentPosition);

            System.out.println("Current position of "+p.getName()+" is "+currentPosition);

            /* S7: win case */
            if (currentPosition==win) {
                isPlay = false;
                System.out.println(p.getName() + " is a winner");
            }

            players.add(p);
        }
    }
}
