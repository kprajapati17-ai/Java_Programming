import java.util.*;

// Parent Class
class Fees {
    int tuitionFees, examFees, otherCharges;

    void getFees() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Tuition Fees: ");
        tuitionFees = sc.nextInt();

        System.out.print("Enter Exam Fees: ");
        examFees = sc.nextInt();

        System.out.print("Enter Other Charges: ");
        otherCharges = sc.nextInt();
    }
}

// Child Class
class Payment extends Fees {
    String studentName;
    int totalFees, paidFees, remainingFees, fine = 0;
    String status;

    void calculate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        sc.nextLine(); // clear buffer
        studentName = sc.nextLine();

        System.out.print("Enter Paid Fees: ");
        paidFees = sc.nextInt();

        // Total Fees
        totalFees = tuitionFees + examFees + otherCharges;

        // Remaining Fees
        remainingFees = totalFees - paidFees;

        // Status
        if (remainingFees == 0) {
            status = "Paid";
        } else {
            status = "Not Paid";
        }

        // Fine (simple logic)
        if (remainingFees > 0) {
            fine = 100; // fixed fine
        }
    }

    void display() {
        System.out.println("\n--- Fee Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Tuition Fees: " + tuitionFees);
        System.out.println("Exam Fees: " + examFees);
        System.out.println("Other Charges: " + otherCharges);
        System.out.println("Total Fees: " + totalFees);
        System.out.println("Paid Fees: " + paidFees);
        System.out.println("Remaining Fees: " + remainingFees);
        System.out.println("Status: " + status);
        System.out.println("Fine: Rs. " + fine);
    }
}

// Main Class
public class Prog_4 {
    public static void main(String[] args) {
        Payment obj = new Payment();

        obj.getFees();   // Parent class method
        obj.calculate(); // Child class method
        obj.display();   // Output
    }
}