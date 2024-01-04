import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        TShirt shirt1 = new TShirt("Gorkhali Batman", 572, 1235, "Karuna",
                "You either die a hero or live long enough to see yourself be a villain", new String[]{"XL", "M", "L"});

        System.out.println("T-shirt details:");
        shirt1.describeTShirt();

        // Order objects
        Order order1 = new Order("Gopal Sharma", "0486756465", new int[]{572, 681}, new int[]{1235, 1780});
        Order order2 = new Order("Himani Bhattarai", "9860239108", new int[]{681, 773}, new int[]{1580, 1000});

        //  Orders
        System.out.println("Order 1 :");
        order1.printBill();

        System.out.println("Order 2 :");
        order2.printBill();
    }
}