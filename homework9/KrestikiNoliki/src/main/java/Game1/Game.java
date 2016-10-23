package Game1;


public abstract class Game {
    String move;

    abstract boolean gameFinished();

    abstract boolean gameNoMove();

    abstract boolean makeMove(String move);

    abstract void printBoard();

    abstract boolean checkGameResult();

    abstract Player getWinner();

    abstract void changePlayer();

    abstract Player getCurrentPlayer();

    final void playGame() {
        while (!gameFinished() && !gameNoMove()) {

            makeMove(move);
            printBoard();
        }
        if (checkGameResult()) {
            Player player = getWinner();
            System.out.println("The winner is " + player.getName() + " " + player.getAge());
        } else System.out.println("Draw. Nobody lost");

    }

}

