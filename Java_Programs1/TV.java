public class TV {
    private final String brand;
    private final int size;
    private final double price;

    public TV(String brand, int size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    public double calculateDiscount() {
        double discount = 0.0;

        if (size < 32) {
            discount = 0.05 * price;
        } else if (size >= 32 && size <= 42) {
            discount = 0.1 * price;
        } else {
            discount = 0.15 * price;
        }

        return discount;
    }

    public void printDetails() {
        double discountedPrice = price - calculateDiscount();

        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size + " inches");
        System.out.println("Discounted Price: " + discountedPrice);
    }

    public static void main(String[] args) {
        TV tv1 = new TV("Sony", 55, 1500.0);
        tv1.printDetails();
    }
}

