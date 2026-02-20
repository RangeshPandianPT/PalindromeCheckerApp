

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String input = "madam";
        String reversed = "";

        // Loop only till half of the string length
        for (int i = input.length() - 1; i>=0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Original String" + input);
        System.out.println("Reversed String " + reversed);
        // Output result

        if (input.equals(reversed)) {
            System.out.println("Result: The String is a Palindrome.");
        }
        else {
            System.out.println("Result: The String is not a Palindrome");
        }
    }
}