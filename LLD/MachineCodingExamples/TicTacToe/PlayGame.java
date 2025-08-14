package LLD.MachineCodingExamples.TicTacToe;

import java.util.HashSet;
import java.util.Scanner;

public class PlayGame {

    private final GameBoard gameBoard;
    private HashSet<Integer> availableMoves;

    PlayGame(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
        availableMoves = new HashSet<>();
        for(int i=1;i<=gameBoard.board.length*gameBoard.board.length;i++) {
            availableMoves.add(i);
        }
    }

    void playGame() {
        System.out.println("We are playing a new game");
        System.out.println("Current board: ");
        gameBoard.displayBoard();

        Player nextTurnPlayer = null;

        while (!WinnerCheck.winCheck(gameBoard.board)) {
            nextTurnPlayer = gameBoard.nextPlayer.poll();
            System.out.println("Next Player Turn: " + nextTurnPlayer.playerName);
            System.out.println("Options available for the current player on board: ");
//            currentPositionsAvailable();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the move: ");
            int number  = scanner.nextInt();
            availableMoves.remove(number);
            int dimension = gameBoard.board.length;
            int row = (number - 1)/dimension;
            int column = (number - 1)%dimension;
            gameBoard.board[row][column] = nextTurnPlayer.playerSymbol;
            gameBoard.displayBoard();
            gameBoard.nextPlayer.offer(nextTurnPlayer);

            if(availableMoves.isEmpty()) {
                System.out.println("Game is drawn");
                return;
            }
        }

        System.out.println("Winner is " + nextTurnPlayer.playerName);
    }

    void currentPositionsAvailable() {
        int dimension = gameBoard.board.length;
        for (Integer move : availableMoves) {
            System.out.println("Row: " + (move-1)/dimension + " Col: " + (move-1)%dimension);
        }
    }
}
