/**
 * Use Case 2: Hardcoded Palindrome Validation
 * Description: This class demonstrates basic palindrome validation
 * using a hardcoded string value[cite: 70, 72, 73].
 * * @author Developer
 * @version 2.0 [cite: 81, 83]
 */
public class UseCase2PalindromeCheckerApp {

    /**
     * Application entry point for UC2[cite: 87].
     * @param args Command-line arguments [cite: 88]
     */
    public static void main(String[] args) {
        // Step 1: Predefined string (String Literal) [cite: 64, 75]
        String input = "madam";
        boolean isPalindrome = true;

        // Step 2: Loop only till half of the string length [cite: 92, 93]
        // Compare character at index i with character at the matching end index
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Step 3: Display the result [cite: 78, 96, 97]
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome?: " + isPalindrome);
    }
}