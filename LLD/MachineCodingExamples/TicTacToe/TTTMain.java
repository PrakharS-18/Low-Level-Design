package LLD.MachineCodingExamples.TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class TTTMain {
    public static void main(String[] args) {
        Player p1 = new Player(1, "Prakhar", 'X');
        Player p2 = new Player(2, "Sajali", 'O');
        List<Player> players = new ArrayList<>(List.of(p1, p2));
        GameBoard gameBoard = new GameBoard(players, 3);
        PlayGame gameOne = new PlayGame(gameBoard);

        gameOne.playGame();
    }
}
