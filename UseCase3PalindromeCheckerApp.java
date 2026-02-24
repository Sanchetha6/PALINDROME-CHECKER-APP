/**
 * Use Case 3: Reverse String Based Palindrome Check
 * Description: Checks whether a string is a palindrome by reversing
 * it and comparing it with the original value. [cite: 116, 118]
 * @author Developer
 * @version 3.0
 */
public class UseCase3PalindromeCheckerApp {

    /**
     * Application entry point for UC3. [cite: 131]
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam"; // Original string [cite: 101]
        String reversed = "";   // To store the reversed version [cite: 121]

        // Step 1: Iterate from the last character to the first [cite: 136]
        for (int i = input.length() - 1; i >= 0; i--) {
            // Step 2: Build the reversed string using concatenation [cite: 110, 121]
            reversed += input.charAt(i);
        }

        // Step 3: Compare original and reversed using equals() [cite: 111, 122]
        boolean isPalindrome = input.equals(reversed);

        // Step 4: Display the validation result [cite: 105, 123]
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Is it a Palindrome?: " + isPalindrome);
    }
}