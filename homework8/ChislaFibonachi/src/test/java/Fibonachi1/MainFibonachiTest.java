package Fibonachi1;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MainFibonachiTest {
    @Test
    public void formulaBineTest() {
        int elementPosledovatelnosti = 10;
        int chisloFibonachi = MainFibonachi.formulaBine(elementPosledovatelnosti);
        assertThat(chisloFibonachi, is(55));
    }
}
