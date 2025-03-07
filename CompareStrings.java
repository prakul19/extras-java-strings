import java.util.Scanner;

public class CompareStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the first string: ");
            String str1 = sc.nextLine();
            System.out.print("Enter the second string: ");
            String str2 = sc.nextLine();
            String result = compareStringsLexicographically(str1, str2);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // Method to compare two strings lexicographically
    public static String compareStringsLexicographically(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            if (ch1 < ch2) {
                return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order";
            } else if (ch1 > ch2) {
                return "\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order";
            }
        }

        if (len1 < len2) {
            return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order";
        } else if (len1 > len2) {
            return "\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order";
        } else {
            return "\"" + str1 + "\" and \"" + str2 + "\" are equal in lexicographical order";
        }
    }
}

/*
Example Input:
Enter the first string: apple
Enter the second string: banana

Example Output:
"apple" comes before "banana" in lexicographical order
*/

