/**
 * Use Case 4: Character Array Based Validation
 * Description: Validates a palindrome by converting the string
 * into a character array and using the two-pointer technique.
 * @author Developer
 * @version 4.0
 */
public class UseCase4PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Step 1: Declare and initialize input string [cite: 173, 174]
        String input = "radar";

        // Step 2: Convert string to char array [cite: 146, 175, 176]
        char[] chars = input.toCharArray();

        // Step 3: Initialize start and end pointers [cite: 177, 178, 179]
        int start = 0;
        int end = chars.length - 1;

        // Step 4: Assume palindrome initially [cite: 180, 181]
        boolean isPalindrome = true;

        // Step 5: Compare characters until pointers cross [cite: 182]
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++; // Move forward
            end--;   // Move backward
        }

        // Step 6: Display the result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}