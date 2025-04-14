package LeetCode.Marco.ValidParentheses_20;

import java.util.Stack;

public class ValidParentheses_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char[] sArray = s.toCharArray();

        for (char c : sArray) {

            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if(!isMatchingPair(top, c)) return false;
            }
        }

        return stack.isEmpty();
    }

        private boolean isMatchingPair(char open, char close){
            return (open == '(' && close == ')') ||
                    (open == '[' && close == ']') ||
                    (open == '{' && close == '}');
        }

        public static void main (String[]args){
            ValidParentheses_20 validParentheses20 = new ValidParentheses_20();

            String input = "()[]{}";
            System.out.println(validParentheses20.isValid(input));
        }
    }
