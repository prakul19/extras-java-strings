import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the first string: ");
            String str1 = sc.nextLine();
            System.out.print("Enter the second string: ");
            String str2 = sc.nextLine();
            boolean isAnagram = checkAnagram(str1, str2);
            System.out.println("Are the two strings anagrams? " + (isAnagram ? "Yes" : "No"));
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // Method to check if two strings are anagrams
    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
	// ASCII character set size
        int[] charCounts = new int[256]; 

        for (int i = 0; i < str1.length(); i++) {
            charCounts[str1.charAt(i)]++;
            charCounts[str2.charAt(i)]--;
        }

        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}

/*
Example Input:
Enter the first string: listen
Enter the second string: silent

Example Output:
Are the two strings anagrams? Yes
*/

