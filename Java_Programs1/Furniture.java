public class Furniture {
    private final String type;
    private final String material;
    private final double price; // Price in dollars


    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    public double calculateDiscount() {
        double discount = 0.0;

        if (material.equalsIgnoreCase("wood")) {
            discount = 0.15 * price;
        } else if (material.equalsIgnoreCase("metal")) {
            discount = 0.1 * price;
        } else {
            discount = 0.05 * price;
        }

        return discount;
    }

    public void printDetails() {
        double discountedPrice = price - calculateDiscount();

        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Discounted Price: " + discountedPrice);
    }

    public static void main(String[] args) {
        Furniture furniture1 = new Furniture("Chair", "wood", 150.0);

        double discount = furniture1.calculateDiscount();

        furniture1.printDetails();
    }
}

