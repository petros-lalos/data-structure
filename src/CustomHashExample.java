import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Δημιουργία HashMap για φοιτητές και βαθμούς
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Προσθήκη δεδομένων στη HashMap
        studentGrades.put("Γιώργος", 90);
        studentGrades.put("Μαρία", 85);
        studentGrades.put("Νίκος", 78);

        // Εκτύπωση δεδομένων
        System.out.println("Φοιτητές και βαθμοί:");
        for (String name : studentGrades.keySet()) {
            System.out.println(name + " -> " + studentGrades.get(name));
        }
    }
}
