package Game1;


import java.util.Scanner;

public class Board {
    public static final int BOARD_SIZE = 3;
    private char[][] board;

    Player playerFirst;
    Player playerSecond;

    Player currentPlayer;

    Player winner;

    int kolichestvoHodov = 0;

    public Board(Player playerFirst, Player playerSecond) {
        this.playerFirst = playerFirst;
        this.playerSecond = playerSecond;

        this.currentPlayer = playerFirst;

        board = new char[BOARD_SIZE][BOARD_SIZE];
        fillBoard();
    }

    public boolean determinePlayer() {
        if (currentPlayer.isDeterminePlayer()) {
            return true;
        } else return false;
    }

    public boolean makeMove(String move) {

        if (!validateMove(move)) {
            return false;
        }
        int i = Character.getNumericValue(move.charAt(0));
        int j = Character.getNumericValue(move.charAt(1));

        if (board[i][j] == ' ') {
            board[i][j] = currentPlayer.getType();
            changePlayer();
            kolichestvoHodov++;
        } else System.out.println("Move impossible! Make your move again");


        return true;
    }

    public void changePlayer() {
        if (currentPlayer == playerFirst) {
            currentPlayer = playerSecond;

        } else {
            currentPlayer = playerFirst;
        }

    }

    public boolean validateMove(String move) {
        if ((move.length() > 2) || (Character.getNumericValue(move.charAt(0)) > 2) ||
                (Character.getNumericValue(move.charAt(0)) > 2)) {
            System.out.println(" ");
            System.out.println("Impossible move! Enter your move again! ");
            System.out.println(" ");
            return false;
        }
        return true;
    }

    private void findWinner() {
        //todo calculate player correctly
        if (currentPlayer == playerFirst) {
            winner = playerSecond;
        } else winner = playerFirst;
    }

    public boolean gameFinished() {
        //todo finish the function
        if ((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') || (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') ||
                (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') || (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') ||
                (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') || (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') ||
                (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') || (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') ||
                (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') || (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') ||
                (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') || (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') ||
                (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') || (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') ||
                (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') || (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')) {
            return true;
        }

        return false;
    }

    public boolean gameNoMove() {
        if (kolichestvoHodov >= 9) {
            return true;
        }
        return false;
    }

    public void fillBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void printBoard() {
        //todo add symbols to show board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + ((char) 9474) + board[i][j]);

            }
            System.out.print(" " + ((char) 9474));
            System.out.println();
            System.out.println(" " + ((char) 9472) + ((char) 9472) + ((char) 9472) + ((char) 9472) +
                    ((char) 9472) + ((char) 9472) + ((char) 9472) + ((char) 9472));

        }
        System.out.println();
    }

    public Player getWinner() {
        findWinner();
        return winner;
    }

    public boolean checkGameResult(Board board) {

        if ((board.gameNoMove() && board.gameFinished()) ||
                (!board.gameNoMove() && board.gameFinished())) {

            return true;
        }
        return false;
    }


}