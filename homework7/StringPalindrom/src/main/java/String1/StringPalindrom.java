package String1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.String;
//import static javax.xml.bind.WhiteSpaceProcessor.trim;

public class StringPalindrom {
    String text;

    public StringPalindrom(String text) {

        this.text = text;
    }

    public int searchPalindrom() {
        int count = 0;
        boolean s = false;
        String[] stringArray = text.split(",");

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = stringArray[i].trim();
            int n = stringArray[i].length();

            for (int j = 0; j < n / 2; j++) {
                if (stringArray[i].charAt(j) == stringArray[i].charAt(n - j - 1)) {
                    s = true;
                    continue;
                } else s = false;
            }
            if (s == true) {
                count++;
            }
        }

        return count;
    }



}
