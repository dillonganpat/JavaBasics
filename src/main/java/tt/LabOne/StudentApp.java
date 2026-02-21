package tt.LabOne;

public class StudentApp {

    public static void main(String[] args) {

        // Create students
        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(102, "Bob");

        // Set GPA
        s1.setGpa(3.8);
        s2.setGpa(2.9);

        // Print students
        System.out.println(s1);
        System.out.println(s2);

        // Use getters
        System.out.println("Student 1 GPA: " + s1.getGpa());
        System.out.println("Student 2 Name: " + s2.getName());

        // Dean's list check
        System.out.println("Is Alice on Dean's List? " + s1.isOnDeansList());
        System.out.println("Is Bob on Dean's List? " + s2.isOnDeansList());
    }
}
