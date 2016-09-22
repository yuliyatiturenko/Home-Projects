package Game1;


import java.util.Scanner;
import java.util.Random;

public class Game {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Player playerFirst = new Player("Bob", 25, 'X');
        Player playerSecond = new ComputerPlayer();
        String move;
        Board board = new Board(playerFirst, playerSecond);

        while (!board.gameFinished() && !board.gameNoMove()) {
            if (board.determinePlayer()) {
                move = EnterMove.getMoveFromRandom(random);
            } else move = EnterMove.getMoveFromConsole(scanner);
            board.makeMove(move);
            board.printBoard();
        }
        if (board.checkGameResult(board)) {
            Player player = board.getWinner();
            System.out.println("The winner is " + player.getName() + " " + player.getAge());
        } else System.out.println("Draw. Nobody lost");
    }

}