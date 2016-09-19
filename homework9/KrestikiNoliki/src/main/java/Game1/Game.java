package Game1;


import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Player playerFirst = new Player("Bob", 25, 'X');
        Player playerSecond = new Player("Mike", 35, 'O');

        Board board = new Board(playerFirst, playerSecond);

        while (!board.gameFinished() && !board.gameNoMove()) {
            String move = getMoveFromConsole(scanner);
            board.makeMove(move);
            board.printBoard();
        }
        if(board.checkGameResult(board)){
            Player player = board.getWinner();
            System.out.println("The winner is " + player.getName() + " " + player.getAge());
        } else System.out.println("Draw. Nobody lost");
    }

    public static String getMoveFromConsole(Scanner scanner) {
        System.out.println("Player moves...");
        System.out.print("Enter your move: ");
        return scanner.next();
    }


}