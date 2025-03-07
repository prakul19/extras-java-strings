import java.util.Scanner;

public class MostFrequentCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String text = sc.nextLine();
            char mostFrequent = findMostFrequentCharacter(text);
            System.out.println("Most Frequent Character: '" + mostFrequent + "'");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // Method to find the most frequent character in a string
    public static char findMostFrequentCharacter(String text) {
	// ASCII character set size
        int[] frequencyArray = new int[256];
        int maxFrequency = 0;
        char mostFrequent = ' ';

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequencyArray[ch]++;
            if (frequencyArray[ch] > maxFrequency) {
                maxFrequency = frequencyArray[ch];
                mostFrequent = ch;
            }
        }

        return mostFrequent;
    }
}

/*
Example Input:
Enter a string: success

Example Output:
Most Frequent Character: 's'
*/

