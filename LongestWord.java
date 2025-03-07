import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();
            String longestWord = findLongestWord(sentence);
            System.out.println("Longest word: " + longestWord);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}

/*
Example Input:
Enter a sentence: My name is prakul.

Example Output:
Longest word: prakul
*/

