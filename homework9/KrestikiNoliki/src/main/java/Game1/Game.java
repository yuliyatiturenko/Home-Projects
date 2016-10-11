package Game1;


public abstract class Game {

    abstract boolean gameFinished();

    abstract boolean gameNoMove();

    abstract boolean makeMove();

    abstract void printBoard();

    abstract boolean checkGameResult();

    abstract Player getWinner();

    final void playGame() {
        while (!gameFinished() && !gameNoMove()) {
            makeMove();
            printBoard();
        }
        if (checkGameResult()) {
            Player player = getWinner();
            System.out.println("The winner is " + player.getName() + " " + player.getAge());
        } else System.out.println("Draw. Nobody lost");

    }

}

