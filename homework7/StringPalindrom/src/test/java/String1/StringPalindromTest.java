package String1;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StringPalindromTest {
    StringPalindrom string1;

    @Test
    public void searchPalindrom() {
        string1 = new StringPalindrom("deleveled, evitative, cat, dog, deified, rita");
        int count = string1.searchPalindrom();
        assertThat(count, is(3));
    }
}
