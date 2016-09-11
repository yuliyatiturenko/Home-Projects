package String1;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StringPalindromTest {
    StringPalindrom words;

    @Test
    public void searchPalindrom() {
        words = new StringPalindrom("deleveled, evitative, cat, dog, deified, rita");
        int count = words.searchPalindrom();
        assertThat(count, is(3));
    }
}
