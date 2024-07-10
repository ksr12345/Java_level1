public class Shirt {
    private final String size;
    private final String color;
    private final double price;

    public Shirt(String size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public double calculateDiscount() {
        double discount = 0.0;

        if (size.equalsIgnoreCase("small")) {
            discount = 0.05 * price;
        } else if (size.equalsIgnoreCase("medium")) {
            discount = 0.1 * price;
        } else if (size.equalsIgnoreCase("large")) {
            discount = 0.15 * price;
        } else {
            discount = 0.02 * price;
        }

        return discount;
    }

    public void printDetails() {
        double discountedPrice = price - calculateDiscount();

        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Discounted Price: " + discountedPrice);
    }

    public static void main(String[] args) {
        Shirt shirt1 = new Shirt("medium", "blue", 25.0);

        shirt1.printDetails();
    }
}
