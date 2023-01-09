import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1) return false;

        Stack<Character> parenthesesStack = new Stack<>();
        System.out.println("Current Stack looks like this: " + parenthesesStack.toString());
        // parenthesesStack.pop();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                parenthesesStack.push(s.charAt(i));
                System.out.println("Current Stack looks like this: " + parenthesesStack.toString());
                // System.out.println();
            } else if (parenthesesStack.isEmpty()) {
                return false;
            }
            else if (s.charAt(i) == ')' && parenthesesStack.peek() == '(') {
                // parenthesesStack.pop();
                System.out.println(parenthesesStack.pop());
            } 
            else if (s.charAt(i) == ']' && parenthesesStack.peek() == '[') {
                // parenthesesStack.pop();
                System.out.println(parenthesesStack.pop());
            }
            else if  (s.charAt(i) == '}' && parenthesesStack.peek() == '{') {
                // parenthesesStack.pop();
                System.out.println(parenthesesStack.pop());
            }
            else 
                return false;
            /* switch (s.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    parenthesesStack.push(s.charAt(i));
                    break;
                case ')':
                    if (parenthesesStack.peek() == ')') {
                        parenthesesStack.pop();
                        break;
                    } else {
                        return false;
                    }
                case '}':
                    if (parenthesesStack.peek() == '{') {
                        parenthesesStack.pop();
                        break;
                    } else {
                        return false;
                    }
                case ']':
                    if (parenthesesStack.peek() == '[') {
                        parenthesesStack.pop();
                        break;
                    } else {
                        return false;
                    }
                default:
                    return false;
            }*/
        }

        if (!parenthesesStack.empty()) {
            return false;
        } else {
            return true;
        }
    }
}
