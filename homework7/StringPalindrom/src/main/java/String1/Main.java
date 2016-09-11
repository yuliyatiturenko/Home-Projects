package String1;


public class Main {
    public static void main(String[] args) {
        StringPalindrom str= new StringPalindrom("deleveled, evitative, cat, dog, deified");
        int count= str.searchPalindrom();
        System.out.println("There are "+ count+ " palindroms in the text");

    }
}
