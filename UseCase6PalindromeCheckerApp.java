import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Use Case 6: Queue Stack Fairness Check
 * Description: Demonstrates palindrome validation by comparing
 * FIFO (Queue) and LIFO (Stack) behaviors.
 * @author Developer
 * @version 6.0
 */
public class UseCase6PalindromeCheckerApp {
    public static void main(String[] args) {
        // Step 1: Define the input string to validate
        String input = "civic";

        // Step 2: Create a Queue (FIFO) and a Stack (LIFO)
        // Note: Queue is an interface, so we use LinkedList as the implementation
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Step 3: Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);  // Enqueue operation [cite: 241]
            stack.push(c); // Push operation [cite: 237]
        }

        // Step 4: Flag to track palindrome status
        boolean isPalindrome = true;

        // Step 5: Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {
            // Dequeue from front vs Pop from top [cite: 238, 256]
            if (!queue.poll().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Step 6: Display the result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}