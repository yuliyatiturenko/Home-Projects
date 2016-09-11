package String2;


public class StringShortening {
    String text;

    public StringShortening(String text) {
        this.text = text;
    }

    public String shorteningLongWords() {

        String[] arrayOfLongWords = text.split(" ");
        String shortWords = "";

        for (int i = 0; i < arrayOfLongWords.length; i++) {

            if (arrayOfLongWords[i].length() > 3) {
                shortWords = shortWords + shorteningLongWord(arrayOfLongWords[i]) + " ";
            } else shortWords = shortWords + arrayOfLongWords[i] + " ";

        }
        return shortWords.trim();
    }

    private String shorteningLongWord(String longWord) {
        String shortWord = "";
        shortWord = shortWord + longWord.charAt(0) + (longWord.length() - 2) + longWord.charAt(longWord.length() - 1);

        return shortWord;
    }
}
