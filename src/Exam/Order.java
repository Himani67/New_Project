import java.util.Arrays;

public class Order {
    // Fields
    String name;
    String phoneNumber;
    int[] items;
    int[] price;

    // Constructor
    public Order(String name, String phoneNumber, int[] items, int[] price) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.items = items;
        this.price = price;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }

    public int[] getPrice() {
        return price;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }

    //  VAT and total price
    public void printBill() {
        double total = 0;
        System.out.println("Order details:");
        System.out.println("   Name: " + name);
        System.out.println("   Phone number: " + phoneNumber);
        System.out.println("   Items: " + Arrays.toString(items));
        System.out.println("   Prices: " + Arrays.toString(price));

        //  total price
        for (double itemPrice : price) {
            total += itemPrice;
        }

        //  VAT
        double vat = total * 0.13;
        double totalPrice = total + vat;

        System.out.println("   VAT (13%): " + vat);
        System.out.println("   Total Price: " + totalPrice);
        System.out.println();
    }
}
