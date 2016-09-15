package Fibonachi2;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FibonachiRecursionTest {
    @Test
    public void fibonachiTest() {
        int elementPosledovatelnosti = 10;
        int chisloFibonachi = FibonachiRecursion.fibonachi(elementPosledovatelnosti);
        assertThat(chisloFibonachi, is(55));
    }
}
