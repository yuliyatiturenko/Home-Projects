package Game1;


abstract class Board {


    public Board() {
    }

    abstract char[][] fillBoard();

    abstract void printBoard();

    abstract boolean validateMove(String move);
}