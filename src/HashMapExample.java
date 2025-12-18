import java.util.HashMap;

class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class HashMapExample {
    public static void main(String[] args) {
        // Δημιουργία HashMap για αποθήκευση φοιτητών
        HashMap<Integer, Student> students = new HashMap<>();
        students.put(101, new Student("Γιώργος", 90));
        students.put(102, new Student("Μαρία", 85));

        // Εκτύπωση δεδομένων
        System.out.println("Φοιτητές:");
        for (Integer id : students.keySet()) {
            Student s = students.get(id);
            System.out.println(id + " -> " + s.name + ", Βαθμός: " + s.grade);
        }
    }
}