import java.util.*;

// Parent Class
class Account {
    int accNo;
    String name;
    double balance;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        accNo = sc.nextInt();

        sc.nextLine(); // clear buffer

        System.out.print("Enter Account Holder Name: ");
        name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }
}

// Child Class
class Transaction extends Account {

    void deposit() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Deposit Amount: ");
        double amt = sc.nextDouble();

        balance = balance + amt;
        System.out.println("Amount Deposited Successfully!");
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Withdraw Amount: ");
        double amt = sc.nextDouble();

        if (amt <= balance) {
            balance = balance - amt;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Main Class
public class Prog_6 {
    public static void main(String[] args) {
        Transaction obj = new Transaction();
        Scanner sc = new Scanner(System.in);

        obj.getData(); // Parent class

        int choice;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.deposit();
                    break;
                case 2:
                    obj.withdraw();
                    break;
                case 3:
                    obj.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}