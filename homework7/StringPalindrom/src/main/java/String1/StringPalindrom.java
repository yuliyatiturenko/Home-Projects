package String1;

public class StringPalindrom {
    String text;

    public StringPalindrom(String text) {

        this.text = text;
    }

    public int searchPalindrom() {
        int count = 0;
        String[] words = text.split(",");

        for (String word : words) {
            if (isPalindrom(word))
                count++;
        }

        return count;
    }

    private boolean isPalindrom(String word) {
        word = word.trim();
        int lengthOfWord = word.length();

        boolean isPalindrom = true;
        for (int j = 0; j < lengthOfWord / 2; j++) {
            if (word.charAt(j) != word.charAt(lengthOfWord - j - 1)) {
                isPalindrom = false;
                break;
            }
        }

        return isPalindrom;
    }
}



