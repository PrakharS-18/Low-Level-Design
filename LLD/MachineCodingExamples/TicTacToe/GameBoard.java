package LLD.MachineCodingExamples.TicTacToe;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GameBoard {
    char[][] board;
    Queue<Player> nextPlayer;

    GameBoard(List<Player> players, int dimension) {
        board = new char[dimension][dimension];
        nextPlayer = new LinkedList<>();
        nextPlayer.addAll(players);

        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void displayBoard() {
        for (char[] chars : board) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(chars[j] + " ");
            }
            System.out.println();
        }
    }
}
