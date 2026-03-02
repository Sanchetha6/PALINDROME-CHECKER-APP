/**
 * Use Case 11: Object-Oriented Palindrome Service
 * Description: Demonstrates palindrome validation using OOP principles.
 * Encapsulates the logic within a Service class.
 * @author Developer
 * @version 11.0
 */

// Service class that encapsulates the logic
class PalindromeService {
    /**
     * Checks whether the input string is a palindrome.
     * @param input The string to validate
     * @return true if palindrome, otherwise false
     */
    public boolean checkPalindrome(String input) {
        if (input == null) return false;

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class UseCase11PalindromeCheckerApp {
    public static void main(String[] args) {
        // Step 1: Create an instance (Object) of the service
        PalindromeService service = new PalindromeService();

        // Step 2: Define input
        String input = "racecar";

        // Step 3: Use the object to perform validation
        boolean result = service.checkPalindrome(input);

        // Step 4: Display the result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + result);
    }
}