import java.util.Stack;

/**
 * Use Case 5: Stack Based Palindrome Checker
 * Description: Validates a palindrome using the Stack data structure
 * which follows the LIFO (Last In, First Out) principle. [cite: 202, 205]
 * @author Developer
 * @version 5.0
 */
public class UseCase5PalindromeCheckerApp {

    /**
     * Application entry point for UC5. [cite: 214]
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Step 1: Declare and initialize the input string [cite: 218]
        String input = "noon";

        // Step 2: Create a Stack to store characters [cite: 219, 220]
        Stack<Character> stack = new Stack<>();

        // Step 3: Push each character of the string into the stack [cite: 221, 222]
        for (char c : input.toCharArray()) {
            stack.push(c); // Push operation [cite: 196]
        }

        // Step 4: Assume palindrome initially [cite: 223, 224]
        boolean isPalindrome = true;

        // Step 5: Pop and compare with the original sequence [cite: 225, 226]
        for (char c : input.toCharArray()) {
            // Pop gives characters in reverse order [cite: 197, 208]
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Step 6: Display the result [cite: 209, 230]
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}