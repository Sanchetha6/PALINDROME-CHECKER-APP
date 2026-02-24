/**
 * Use Case 10: Normalized Palindrome Validation
 * Description: Validates a palindrome after preprocessing the input string.
 * Normalization includes removing spaces/symbols and converting to lowercase.
 * @author Developer
 * @version 10.0
 */
public class UseCase10PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Step 1: Input string with spaces and mixed case
        String input = "A man a plan a canal Panama";

        // Step 2: Normalization
        // \\s removes all whitespace; toLowerCase() ignores case
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Step 3: Standard Palindrome Logic (Two-Pointer / Symmetric)
        boolean isPalindrome = true;
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Step 4: Display the result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}