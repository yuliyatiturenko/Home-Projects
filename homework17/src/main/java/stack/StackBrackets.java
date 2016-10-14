package stack;

import java.util.Stack;

public class StackBrackets {

    public boolean isBalanced(String stringBrackets) {
        Stack<Character> brackets = new Stack();

        if ((stringBrackets.length() % 2 != 0)) {
            return false;
        } else {
            for (int i = 0; i < stringBrackets.length(); i++) {
                if (stringBrackets.charAt(i) == '[' || stringBrackets.charAt(i) == '{' || stringBrackets.charAt(i) == '(') {
                    brackets.push(stringBrackets.charAt(i));
                } else {
                    if ((stringBrackets.charAt(i) - brackets.peek()) == 1 || (stringBrackets.charAt(i) - brackets.peek() == 2)) {
                        brackets.pop();
                    } else return false;
                }
            }
        }
        return true;
    }
}
