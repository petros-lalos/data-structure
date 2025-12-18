import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Εισαγωγή συμβολοσειράς
        System.out.print("Εισάγετε μια λέξη: ");
        String input = scanner.nextLine();

        // Υπολογισμός συχνότητας χαρακτήρων
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        // Εκτύπωση συχνότητας χαρακτήρων
        System.out.println("Συχνότητα χαρακτήρων:");
        for (char c : frequency.keySet()) {
            System.out.println(c + " -> " + frequency.get(c));
        }

        scanner.close();
    }
}
