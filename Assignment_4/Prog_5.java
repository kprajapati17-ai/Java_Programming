import java.util.*;

// Parent Class
class Item {
    String itemName;
    int totalStock, remainingStock;
    int purchasePrice;

    void getItemData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Name: ");
        itemName = sc.nextLine();

        System.out.print("Enter Total Stock: ");
        totalStock = sc.nextInt();

        System.out.print("Enter Remaining Stock: ");
        remainingStock = sc.nextInt();

        System.out.print("Enter Purchase Price: ");
        purchasePrice = sc.nextInt();
    }
}

// Child Class
class Sale extends Item {
    int quantity, salePrice, totalAmount;

    void saleProcess() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Quantity to Sell: ");
        quantity = sc.nextInt();

        if (quantity <= remainingStock) {
            System.out.print("Enter Sale Price: ");
            salePrice = sc.nextInt();

            totalAmount = quantity * salePrice;

            remainingStock = remainingStock - quantity;
        } else {
            System.out.println("Stock not available!");
        }
    }

    void display() {
        System.out.println("\n--- Sale Details ---");
        System.out.println("Item Name: " + itemName);
        System.out.println("Purchase Price: " + purchasePrice);
        System.out.println("Sale Price: " + salePrice);
        System.out.println("Quantity Sold: " + quantity);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Remaining Stock: " + remainingStock);
    }
}

// Main Class
public class Prog_5 {
    public static void main(String[] args) {
        Sale obj = new Sale();

        obj.getItemData(); // Parent class
        obj.saleProcess(); // Child class
        obj.display();     // Output
    }
}