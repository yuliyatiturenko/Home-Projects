package Game1;


public class KrestikiNoliki extends Game {

    Player playerFirst;
    Player playerSecond;
    Board krestikiNoliki = new BoardKrestikiNoliki(playerFirst, playerSecond);
    Player currentPlayer = playerFirst;
    Player winner;
    private int kolichestvoHodov = 0;
    private char[][] board = krestikiNoliki.fillBoard();

    public KrestikiNoliki() {
        playerFirst = FirstFrameController.returnPlayerFirst();
        playerSecond = SecondFrameController.returnPlayerSecond();
        krestikiNoliki = new BoardKrestikiNoliki(playerFirst, playerSecond);
        currentPlayer = playerFirst;
        board = krestikiNoliki.fillBoard();
    }


    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    boolean gameNoMove() {
        if (kolichestvoHodov >= 9) {
            return true;
        }
        return false;
    }

    boolean makeMove(String move) {


        if (!krestikiNoliki.validateMove(move)) {
            return false;
        }
        int i = Character.getNumericValue(move.charAt(0));
        int j = Character.getNumericValue(move.charAt(1));

        board[i][j] = currentPlayer.getType();
        changePlayer();
        kolichestvoHodov++;

        return true;
    }

    void printBoard() {

        krestikiNoliki.printBoard();
    }

    boolean checkGameResult() {
        if ((gameNoMove() && gameFinished()) ||
                (!gameNoMove() && gameFinished())) {

            return true;
        }
        return false;
    }

    Player getWinner() {
        findWinner();
        return winner;
    }

    public void changePlayer() {
        if (currentPlayer == playerFirst) {
            currentPlayer = playerSecond;
        } else {
            currentPlayer = playerFirst;
        }

    }

    private void findWinner() {

        if (currentPlayer == playerFirst) {
            winner = playerSecond;
        } else winner = playerFirst;
    }

    boolean gameFinished() {
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


}

