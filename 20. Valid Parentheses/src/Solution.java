import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1) return false;

        Stack<Character> parenthesesStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                parenthesesStack.push(s.charAt(i));
                // System.out.println("Current Stack looks like this: " + parenthesesStack.toString());
                // System.out.println();
            } else if (parenthesesStack.isEmpty()) {
                return false;
            }
            else if (s.charAt(i) == ')' && parenthesesStack.peek() == '(') {
                parenthesesStack.pop();
                // System.out.println(parenthesesStack.pop());
            } 
            else if (s.charAt(i) == ']' && parenthesesStack.peek() == '[') {
                parenthesesStack.pop();
                // System.out.println(parenthesesStack.pop());
            }
            else if  (s.charAt(i) == '}' && parenthesesStack.peek() == '{') {
                parenthesesStack.pop();
                // System.out.println(parenthesesStack.pop());
            }
            else 
                return false;
        }

        // AFTER ALL THE POPPING AND PUSHING, IF THE STACK HAS STUFF REMAINING, THAT MEANS
        // BRACKETS HAVE NOT BEEN CLOSED; WHICH MEANS IT IS FALSE. BUT IF IT IS EMPTY, THEN
        // IT IS GOOD TO GO!
        if (!parenthesesStack.empty()) {
            return false;
        } else {
            return true;
        }
    }
}
