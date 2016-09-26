package Game1;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BoardTest {

    Player playerSecond;
    Player playerFirst;
    Board board1 = new Board(playerFirst, playerSecond);

    @Before
    public void setUp() {
        playerFirst = new Human("Bob", 25, 'X');
        playerSecond = new Computer();
    }


    @Test
    public void getWinnerTest() {
        Player currentPlayer = playerSecond;
        Player winner = board1.getWinner();
        String winnersName = winner.getName();
        assertThat(winnersName, is("Bob"));
    }


    @Test
    public void validateMoveTest() {
        String move="22";
        boolean b = board1.validateMove(move);
        assertThat(b, is(true));
    }

    @Test
    public void gameFinishedTest() {
        char[][] board;
        board = new char[3][3];
        board1.fillBoard();
        boolean b = board1.gameFinished();
        assertThat(b, is(false));

    }


}
