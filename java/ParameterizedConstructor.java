
class Student {
    // Instance variables
    String name;
    int id;
    double marks1;
    double marks2;

    // Parameterized Constructor
    // Initializes name, id, and marks for two subjects
    public Student(String name, int id, double marks1, double marks2) {
        this.name = name;
        this.id = id;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    // Method to calculate and display student details including total
    public void displayInfo() {
        // Simple calculation using the initialized values
        double total = marks1 + marks2;
        double average = total / 2;

        System.out.println("Student Details:");
        System.out.println("Name:    " + name);
        System.out.println("ID:      " + id);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Total:   " + total);
        System.out.println("Average: " + average);
        System.out.println("-------------------------");
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        // Creating objects with name, id, and marks
        System.out.println("Creating student objects with marks...");
        
        Student student1 = new Student("Alice Johnson", 101, 85.5, 90.0);
        Student student2 = new Student("Bob Smith", 102, 75.0, 88.5);

        // Displaying details and calculated results
        student1.displayInfo();
        student2.displayInfo();
    }
}
