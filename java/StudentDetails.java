// 3. Write a Java program to create a class Student with fields and methods, and display
// student details using an object.

class Student{
    int rollNo;
    String name;
    String dept;
    String college;
    // void setData(int r, String n, String d, String c){
    //     rollNo = r;
    //     name = n;
    //     dept = d;
    //     college = c;
    // }

    Student(int r, String n, String d, String c){
        this.rollNo = r;
        this.name = n;
        this.dept = d;
        this.college = c;
    }
    void displayDetails(){
        System.out.println("Student roll number: "+rollNo);
        System.out.println("Student name: "+name);
        System.out.println("Student deptartment: "+dept);
        System.out.println("Student College: "+college);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Student s1 = new Student(101,"John","EEE", "XYZ College");
        // s1.setData(101,"John","EEE", "XYZ Colllege");
        s1.displayDetails();
        
    }
}
    

