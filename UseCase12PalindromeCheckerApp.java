interface PalindromeStrategy {
    boolean check(String input);
}

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

public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Level";
        String cleanedInput = input.toLowerCase();

        PalindromeStrategy strategy = new StackStrategy();
        boolean result = strategy.check(cleanedInput);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + result);
    }
}
