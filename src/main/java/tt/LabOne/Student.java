package tt.LabOne;

public class Student {

    // Attributes
    private int id;
    private String name;
    private double gpa;

    // Constructor (takes id and name, gpa starts at 0)
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.gpa = 0.0;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    // Mutator (set GPA if valid)
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }

    // Dean's list check
    public boolean isOnDeansList() {
        return gpa >= 3.5;
    }

    // toString
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", GPA: " + gpa;
    }
}