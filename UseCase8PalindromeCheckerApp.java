import java.util.LinkedList;

/**
 * Use Case 8: Linked List Based Palindrome Checker
 * Description: Checks whether a string is a palindrome using a LinkedList.
 * Characters are added and then compared by removing elements from both ends.
 * @author Developer
 * @version 8.0
 */
public class UseCase8PalindromeCheckerApp {

    /**
     * Application entry point for UC8.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Step 1: Define the input string [cite: 367]
        String input = "level";

        // Step 2: Create a LinkedList to store characters [cite: 369]
        LinkedList<Character> list = new LinkedList<>();

        // Step 3: Add each character to the linked list [cite: 371, 372]
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Step 4: Flag to track palindrome state [cite: 374]
        boolean isPalindrome = true;

        // Step 5: Compare until only one or zero elements remain
        while (list.size() > 1) {
            // removeFirst() and removeLast() allow symmetric validation [cite: 351, 352, 353]
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Step 6: Display the result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}