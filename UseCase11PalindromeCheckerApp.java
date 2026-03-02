class PalindromeService {
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
        PalindromeService service = new PalindromeService();

        String input = "racecar";
        boolean result = service.checkPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + result);
    }
}
