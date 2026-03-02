/**
 * Use Case 13: Performance Comparison
 * Description: Measures and compares the execution performance
 * of palindrome validation algorithms using nanosecond precision.
 * @author Developer
 * @version 13.0
 */

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : input.toCharArray()) stack.push(c);
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

public class UseCase13PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Level";
        String cleanedInput = input.toLowerCase();

        PalindromeStrategy strategy = new StackStrategy();

        // Step 1: Capture start time in nanoseconds
        long startTime = System.nanoTime();

        // Step 2: Execute the algorithm
        boolean result = strategy.check(cleanedInput);

        // Step 3: Capture end time
        long endTime = System.nanoTime();

        // Step 4: Calculate duration
        long duration = endTime - startTime;

        // Step 5: Display results and performance metrics
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time: " + duration + " ns");
    }
}