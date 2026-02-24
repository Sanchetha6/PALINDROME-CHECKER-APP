import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Use Case 7: Deque Based Optimized Palindrome Checker
 * Description: Validates a palindrome using a Deque (Double Ended Queue)
 * by comparing elements from both ends simultaneously.
 * @author Developer
 * @version 7.0
 */
public class UseCase7PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Step 1: Define the input string [cite: 316]
        String input = "refer";

        // Step 2: Create a Deque to store characters [cite: 318]
        Deque<Character> deque = new ArrayDeque<>();

        // Step 3: Add each character to the deque [cite: 320]
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Step 4: Flag to track palindrome result [cite: 323]
        boolean isPalindrome = true;

        // Step 5: Continue comparison while more than one element exists [cite: 325]
        while (deque.size() > 1) {
            // Remove and compare characters from both ends [cite: 301, 302, 303]
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Step 6: Display the result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}
