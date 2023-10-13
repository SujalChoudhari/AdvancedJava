// WAP to convert an infix expression to postfix and evaluate the same. [input in the form of 5*7+8-3]

import java.util.Stack;

public class Four {

    static String PRECEDENCE = "*/+-";
    public static void main(String[] args) {
            String input = "5*7+8-3";
            

            String postfixed =convert(input);


    }

    public static String convert(String input){

        Stack<Character> stack = new Stack<Character>();
        StringBuilder postfixed = new StringBuilder("");

        for(char ch: input.toCharArray()){
            if(isOperator(ch)){

            }
            else {
                
            }
        }
        

        return "";
    }

    public static boolean isOperator(char op){
        return PRECEDENCE.contains(op);
    } 
}