import java.util.Arrays;

public class TShirt {
    // Fields to represent the T-shirt details
    String itemName;
    int productCode;
    double price;
    String brand;
    String description;
    String[] sizes;

    // Constructor to initialize the fields
    public TShirt(String itemName, int productCode, int price, String brand, String description, String[] sizes) {
        this.itemName = itemName;
        this.productCode = productCode;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.sizes = sizes;
    }

    // Getters and setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getProductCode() {

        return productCode;
    }

    public void setProductCode(int productCode) {

        this.productCode = productCode;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public String[] getSizes() {

        return sizes;
    }

    public void setSizes(String[] sizes) {

        this.sizes = sizes;
    }
    public void describeTShirt() {
        System.out.println("Item name: " + getItemName());
        System.out.println("Product code: " + getProductCode());
        System.out.println("Price: " + getPrice());
        System.out.println("Brand: " + getBrand());
        System.out.println("Description: " + getDescription());
        System.out.print("Sizes: [");
        for (String size : getSizes()) {
            System.out.print(size + " ");
        }
        System.out.println("]");
    }

}
