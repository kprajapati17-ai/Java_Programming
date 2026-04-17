import java.util.*;

// Parent Class
class BookIssue {
    String studentName;
    String bookName;
    int d1, m1, y1; // Issue Date

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Book Name: ");
        bookName = sc.nextLine();

        System.out.println("Enter Issue Date (day month year): ");
        d1 = sc.nextInt();
        m1 = sc.nextInt();
        y1 = sc.nextInt();
    }
}

// Child Class
class ReturnBook extends BookIssue {
    int d2, m2, y2; // Return Date
    int delay;
    int fine = 0;

    void calculateFine() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Return Date (day month year): ");
        d2 = sc.nextInt();
        m2 = sc.nextInt();
        y2 = sc.nextInt();

        // Convert into total days (simple method)
        int total1 = y1 * 365 + m1 * 30 + d1;
        int total2 = y2 * 365 + m2 * 30 + d2;

        delay = total2 - total1;

        // ✅ First 30 days FREE
        if (delay > 30) {
            delay = delay - 30;
        } else {
            delay = 0;
        }

        // Fine calculation
        if (delay > 0) {
            if (delay <= 15) {
                fine = delay * 1;
            } else {
                fine = (15 * 1) + ((delay - 15) * 2);
            }
        }
    }

    void display() {
        System.out.println("\n--- Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Book Name: " + bookName);

        System.out.println("Issue Date: " + d1 + "/" + m1 + "/" + y1);
        System.out.println("Return Date: " + d2 + "/" + m2 + "/" + y2);

        System.out.println("Delay days (after 30 days): " + delay);
        System.out.println("Fine: Rs. " + fine);
    }
}

// Main Class
public class Prog_3 {
    public static void main(String[] args) {
        ReturnBook obj = new ReturnBook();

        obj.getData();        // Parent class
        obj.calculateFine(); // Child class
        obj.display();       // Output
    }
}