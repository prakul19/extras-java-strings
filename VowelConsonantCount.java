import java.util.Scanner;

public class VowelConsonantCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String text = sc.nextLine();
            int[] counts = countVowelsAndConsonants(text);
            System.out.println("Vowels: " + counts[0]);
            System.out.println("Consonants: " + counts[1]);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }
}

/*
Example Input:
Enter a string: Hello World

Example Output:
Vowels: 3
Consonants: 7
*/

