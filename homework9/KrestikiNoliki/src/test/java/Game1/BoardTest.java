package Game1;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BoardTest {

    Player playerSecond;
    Player playerFirst;
    Board board1 = new BoardKrestikiNoliki(playerFirst, playerSecond);
    Game game = new KrestikiNoliki();


    @Before
    public void setUp() {
        playerFirst = new Human("Bob", 25, 'X');
        playerSecond = new Computer();

    }


    @Test
    public void getWinnerTest() {

        Player winner = game.getWinner();
        String winnersName = winner.getName();
        assertThat(winnersName, is("AsusX756U"));
    }


    @Test
    public void validateMoveTest() {
        String move = "22";
        boolean b = board1.validateMove(move);
        assertThat(b, is(true));
    }

    @Test
    public void gameFinishedTest() {

        boolean b = game.gameFinished();
        assertThat(b, is(false));


    }
}