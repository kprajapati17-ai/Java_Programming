import java.util.*;

// Student Class
class Student {
    int rollNo;
    String name;
    double marks;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();

        sc.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }
}

// Main Class
public class Prog_8 {
    public static void main(String[] args) {

        Student[] s = new Student[5]; // array of 5 students

        // Input
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter Details of Student " + (i + 1));
            s[i] = new Student(); // create object
            s[i].getData();
        }

        // Output
        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < 5; i++) {
            s[i].display();
        }
    }
}