import java.util.HashMap;
import java.util.Scanner;

public class SearchInHashMap {
    public static void main(String[] args) {
        // Δημιουργία HashMap
        HashMap<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("George", 90);
        studentGrades.put("Maria", 85);
        studentGrades.put("Nik", 78);

        // Αναζήτηση ονόματος
        Scanner scanner = new Scanner(System.in);
        System.out.print("Εισάγετε όνομα φοιτητή: ");
        String name = scanner.nextLine();

        if (studentGrades.containsKey(name)) {
            System.out.println("Ο βαθμός του/της " + name + " είναι: " + studentGrades.get(name));
        } else {
            System.out.println("Ο φοιτητής/η φοιτήτρια " + name + " δεν βρέθηκε.");
        }
        scanner.close();
    }
}
