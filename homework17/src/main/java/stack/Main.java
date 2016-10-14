package stack;

public class Main {
    public static void main(String[] args) {
        String stringBrackets = "{{{()[]}}})";
        StackBrackets stackBrackets = new StackBrackets();

        if (stackBrackets.isBalanced(stringBrackets)) {
            System.out.println("Brackets are balanced " +stringBrackets );
        } else
            System.out.println("Brackets are not balanced "+  stringBrackets);

    }

}
