package Game1;

public class BoardKrestikiNoliki extends Board {

    final static int BOARD_SIZE = 3;
    private char[][] board;
    Player playerFirst;
    Player playerSecond;
    Player currentPlayer;

    public BoardKrestikiNoliki(Player playerFirst, Player playerSecond) {
        this.playerFirst = playerFirst;
        this.playerSecond = playerSecond;
        this.currentPlayer = playerFirst;
        board = new char[BOARD_SIZE][BOARD_SIZE];
        fillBoard();
    }

    public char[][] fillBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        return board;
    }

    public void printBoard() {

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

    boolean validateMove(String move) {
        if ((move.length() > 2) || (Character.getNumericValue(move.charAt(0)) > 2) ||
                (Character.getNumericValue(move.charAt(0)) > 2) ||
                (board[Character.getNumericValue(move.charAt(0))][Character.getNumericValue(move.charAt(1))] != ' ')) {
            System.out.println(" ");
            System.out.println("Impossible move! Enter your move again! ");
            System.out.println(" ");
            return false;
        }
        return true;
    }
}
