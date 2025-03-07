import java.util.Scanner;

public class RemoveCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String text = sc.nextLine();
            System.out.print("Enter the character to remove: ");
            char charToRemove = sc.next().charAt(0);
            String modifiedString = removeCharacter(text, charToRemove);
            System.out.println("Modified String: " + modifiedString);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // Method to remove all occurrences of a specific character from a string
    public static String removeCharacter(String text, char charToRemove) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != charToRemove) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}

/*
Example Input:
Enter a string: Hello World
Enter the character to remove: l

Example Output:
Modified String: Heo Word
*/

