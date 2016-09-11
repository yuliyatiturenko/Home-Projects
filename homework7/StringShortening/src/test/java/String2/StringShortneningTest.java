package String2;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StringShortneningTest {
    StringShortening longSizeWords;
    @Test
    public void StringShortening(){
        longSizeWords= new StringShortening("internationalization localization cat elephant monitor");
        String shortSizeWords=longSizeWords.shorteningLongWords();
        assertThat(shortSizeWords,is("i18n l10n cat e6t m5r"));
    }

}
