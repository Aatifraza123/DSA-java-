import java.util.*;

public class Stacks {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(45);
        stack.push(56);
        System.out.println(stack);
        while (stack.size() > 2) {
            stack.pop();
        }
        System.out.println(stack);
    }
}
