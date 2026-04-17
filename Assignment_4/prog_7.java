import java.util.*;

// Parent Class
class Train {
    int trainNo, ticketPrice, availableSeats;

    void getTrainData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Train Number: ");
        trainNo = sc.nextInt();

        System.out.print("Enter Ticket Price: ");
        ticketPrice = sc.nextInt();

        System.out.print("Enter Available Seats: ");
        availableSeats = sc.nextInt();
    }
}

// Child Class
class Booking extends Train {
    int seatsBooked, totalAmount;
    String travelDate;

    void bookTicket() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Seats to Book: ");
        seatsBooked = sc.nextInt();

        if (seatsBooked <= availableSeats) {

            sc.nextLine(); // clear buffer
            System.out.print("Enter Travel Date: ");
            travelDate = sc.nextLine();

            totalAmount = seatsBooked * ticketPrice;

            availableSeats = availableSeats - seatsBooked;

        } else {
            System.out.println("Seats not available!");
        }
    }

    void display() {
        System.out.println("\n--- Booking Details ---");
        System.out.println("Train Number: " + trainNo);
        System.out.println("Travel Date: " + travelDate);
        System.out.println("Seats Booked: " + seatsBooked);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Remaining Seats: " + availableSeats);
    }
}

// Main Class
public class prog_7 {
    public static void main(String[] args) {
        Booking obj = new Booking();

        obj.getTrainData(); // Parent class
        obj.bookTicket();  // Child class
        obj.display();     // Output
    }
}