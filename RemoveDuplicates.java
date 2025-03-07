import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String text = sc.nextLine();
            String result = removeDuplicates(text);
            System.out.println("Modified string: " + result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String text) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // ASCII character set size

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!seen[ch]) {
                result.append(ch);
                seen[ch] = true;
            }
        }
        return result.toString();
    }
}

/*
Example Input:
Enter a string: programming

Example Output:
Modified string: progamin
*/

