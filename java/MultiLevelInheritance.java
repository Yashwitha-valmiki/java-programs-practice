// // // /*
// //  * Basic Multilevel Inheritance Example
// //  * Flow: Student -> Marks -> Result
// //  */

// // // Level 1: Grandparent
// class Student {
//     int id = 101; // Fixed ID for simplicity
//     String name = "Neo Anderson";
//     // public Student({
//     //     this.id = id;

//     // }
// }

// // Level 2: Parent (inherits from Student)
// class Marks extends Student {
//     // Adding three subjects now
//     int math = 90;
//     int science = 90;
//     int chemistry = 90; // New subject mark
// }

// // Level 3: Child (inherits from Marks)
// class Result extends Marks {
    
//     void showResult() {
//         // Calculation using variables from Level 2
//         // Updated to include Chemistry
//         int total = math + science + chemistry;
//         double avg = total / 3.0; // Divide by 3 subjects
        
//         System.out.println("--- Student Report Card ---");
//         // Accessing variables from Level 1 (id, name)
//         System.out.println("Student ID: " + id);
//         System.out.println("Name: " + name);
//         System.out.println("---------------------------");
//         System.out.println("Math Score: " + math);
//         System.out.println("Science Score: " + science);
//         System.out.println("Chemistry Score: " + chemistry);
//         System.out.println("---------------------------");
//         System.out.println("Total Marks: " + total);
//         System.out.printf("Average Score: %.2f\n", avg);
//         System.out.println("---------------------------");
//     }
// }

// public class MultiLevelInheritance {
//     public static void main(String[] args) {
//         // Create object of the last class
//         Result obj = new Result();
        
//         // Call the method
//         obj.showResult();
//     }
// }
// write a program to implement multi level inheritance

class Student{

    int id = 101;

    String name = "John";

}



class Marks extends Student{

    int maths = 98;

    int physics = 89;

    int chemistry = 80;

}



class Report extends Marks{



    int total = maths+physics+chemistry;

    double avg = total/3;

    void showResult(){

        System.out.println("Final Report:");

        System.out.println("Student ID:"+ id);

        System.out.println("Student Name:"+ name);

        System.out.println("Maths Score:"+maths);

        System.out.println("Physics Score:"+ physics);

        System.out.println("Chemistry Score:"+chemistry);



    }

}





public class MultiLevelInheritance {

    public static void main(String[] args) {

        Report r1 = new Report();

        r1.showResult();

    }

   

}