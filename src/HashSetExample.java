import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Δημιουργία HashSet για μοναδικά ονόματα
        HashSet<String> names = new HashSet<>();

        // Εισαγωγή δεδομένων
        names.add("Γιώργος");
        names.add("Μαρία");
        names.add("Γιώργος");
        names.add("Νίκος");

        // Εκτύπωση μοναδικών ονομάτων
        System.out.println("Μοναδικά ονόματα: " + names);
    }
}
