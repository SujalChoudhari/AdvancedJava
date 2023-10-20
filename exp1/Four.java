// WAP to convert an infix expression to postfix and evaluate the same. [input in the form of 5*7+8-3]
import java.util.Stack;

public class Four {

    static String PRECEDENCE = "*/+-";

    public static void main(String[] args) {
        String input = "5*7+8-3";
        String postfixed = convert(input);
        System.out.println("Postfix Expression: " + postfixed);
    }

    public static String convert(String input) {

        Stack<Character> stack = new Stack<>();
        StringBuilder postfixed = new StringBuilder();
        
        for (char ch : input.toCharArray()) {
            if (isOperator(ch)) {
                while (!stack.isEmpty() && firstHasHigherPriority(ch,stack.peek())) {
                    postfixed.append(stack.pop());
                }
                stack.push(ch);
            } else {
                postfixed.append(ch);
            }
        }

        while (!stack.isEmpty()) {
            postfixed.append(stack.pop());
        }

        return postfixed.toString();
    }

    public static boolean firstHasHigherPriority(char first, char second) {
        return PRECEDENCE.indexOf(first) >= PRECEDENCE.indexOf(second);
    }

    public static boolean isOperator(char op) {
        return PRECEDENCE.indexOf(op) != -1;
    }
}
