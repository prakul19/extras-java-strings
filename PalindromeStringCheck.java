import java.util.Scanner;

public class PalindromeStringCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String text = sc.nextLine();
            boolean isPalindrome = checkPalindrome(text);
            System.out.println("Is the string a palindrome? " + (isPalindrome ? "Yes" : "No"));
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // Method to check if a string is a palindrome
    public static boolean checkPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

/*
Example Input:
Enter a string: racecar

Example Output:
Is the string a palindrome? Yes
*/

