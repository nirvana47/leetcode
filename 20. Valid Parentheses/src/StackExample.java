import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push some integers onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Print the top element of the stack
        System.out.println(stack.peek());  // Outputs 3

        // Pop the top element of the stack and print it
        System.out.println(stack.pop());  // Outputs 3

        // Print the top element of the stack again
        System.out.println(stack.peek());  // Outputs 2

        // Check if the stack is empty
        System.out.println(stack.empty());  // Outputs false
    }
}
