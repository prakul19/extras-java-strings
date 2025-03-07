import java.util.Scanner;

public class SubstringOccurences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the main string: ");
            String mainString = sc.nextLine();
            System.out.print("Enter the substring: ");
            String substring = sc.nextLine();
            int count = countSubstringOccurrences(mainString, substring);
            System.out.println("The substring occurs " + count + " times.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // Method to count the occurrences of a substring in a string
    public static int countSubstringOccurrences(String mainString, String substring) {
        int count = 0;
        int index = 0;
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        return count;
    }
}

/*
Example Input:
Enter the main string: abababab
Enter the substring: ab

Example Output:
The substring occurs 4 times.
*/

