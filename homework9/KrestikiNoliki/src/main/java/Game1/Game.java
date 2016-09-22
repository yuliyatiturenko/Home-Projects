package Game1;


public class Game {

    public static void main(String[] args) {



        Player playerFirst = new Human("Bob",25,'X');
        Player playerSecond = new Computer();
        Board board = new Board(playerFirst, playerSecond);

        while (!board.gameFinished() && !board.gameNoMove()) {
            String move =board.currentPlayer.enterMove() ;
            board.makeMove(move);
            board.printBoard();
        }
        if (board.checkGameResult(board)) {
            Player player = board.getWinner();
            System.out.println("The winner is " + player.getName() + " " + player.getAge());
        } else System.out.println("Draw. Nobody lost");
    }

}