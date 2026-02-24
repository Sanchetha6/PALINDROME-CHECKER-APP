/**
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 * Description: Implements the Strategy Pattern to allow switching
 * between different palindrome algorithms at runtime.
 * @author Developer
 * @version 12.0
 */

// 1. The Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// 2. Concrete Strategy: Stack-based implementation
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        if (input == null) return false;
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// 3. Main Application Class
public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Level";
        // Normalizing for the check (Standard requirement for high-level apps)
        String cleanedInput = input.toLowerCase();

        // Step 1: Define the strategy we want to use
        PalindromeStrategy strategy = new StackStrategy();

        // Step 2: Execute the algorithm through the interface
        boolean result = strategy.check(cleanedInput);

        // Step 3: Display results
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + result);
    }
}