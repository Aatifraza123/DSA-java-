import java.util.Stack;

public class stack_2 {
    public static void main(String[] args) {
        // Creating a stack
        Stack<String> stack = new Stack<>();

        // Adding items to the stack (push)
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Mango");
        stack.push("Orange");
        System.out.println("Stack after pushing: " + stack); // Output: [Apple, Banana, Mango, Kela]
        System.out.println("Stack size: " + stack.size());

        // Removing the top item from the stack (pop)
        String lastItem = stack.pop();
        System.out.println("Popped item: " + lastItem); // Output: Orange
        System.out.println("Stack after popping: " + stack); // Output: [Apple, Banana, Mango]
        System.out.println("Stack size: " + stack.size());
        // Checking if the stack is empty after popping
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
    }
}
