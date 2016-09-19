package Game1;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BoardTest {

    Player playerSecond;
    Player playerFirst;
    Board board = new Board(playerFirst, playerSecond);
    @Before
    public void setUp(){
        playerFirst= new Player("Bob", 25, 'X');
        playerSecond= new Player("Mike", 35, 'O');
    }


    @Test
    public void getWinnerTest() {
        Player currentPlayer= playerSecond;
        Player winner=board.getWinner();
        String winnersName=winner.getName();
        assertThat(winnersName,is("Bob"));
    }


    @Test
    public  void validateMoveTest(){

        String move="22";
        boolean b= board.validateMove(move);
        assertThat(b,is(true));
    }
    @Test
    public void gameFinishedTest(){
        char[][] board1;
        board1=new char[3][3];
        boolean b= board.gameFinished();
        assertThat(b,is(false));

    }


}
