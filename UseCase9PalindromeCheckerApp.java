/**
 * Use Case 9: Recursive Palindrome Checker
 * Description: Validates a palindrome using recursion by comparing
 * characters from outer positions moving inward.
 * @author Developer
 * @version 9.0
 */
public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "madam";

        // Step 1: Call the recursive helper method
        // Start at index 0 and end at length - 1
        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + result);
    }

    /**
     * Recursive helper method to check palindrome status.
     * @param s The input string
     * @param start Starting index for comparison
     * @param end Ending index for comparison
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base Condition: If pointers cross or meet, all characters matched
        if (start >= end) {
            return true;
        }

        // If characters at current indices don't match, it's not a palindrome
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call: Move indices inward
        return check(s, start + 1, end - 1);
    }
}