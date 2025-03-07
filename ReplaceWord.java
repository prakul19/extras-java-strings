import java.util.Scanner;

public class ReplaceWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the original sentence: ");
            String sentence = sc.nextLine();
            System.out.print("Enter the word to replace: ");
            String oldWord = sc.nextLine();
            System.out.print("Enter the new word: ");
            String newWord = sc.nextLine();
            String modifiedSentence = replaceWord(sentence, oldWord, newWord);
            System.out.println("Modified Sentence: " + modifiedSentence);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // Method to replace a given word with another word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    }
}

/*
Example Input:
Enter the original sentence: Hello, my name is prakul. 
Enter the word to replace: Hello
Enter the new word: Hi

Example Output:
Modified Sentence: Hi, my name is prakul.
*/

