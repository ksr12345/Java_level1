public class Phone {
    private final String make;
    private final String model;
    private final int storage;

    public Phone(String make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    public double calculatePrice() {
        double basePrice = 0.0;

        if (make.equalsIgnoreCase("Apple")) {
            if (model.equalsIgnoreCase("iPhone 12")) {
                basePrice = 1000.0;
            } else if (model.equalsIgnoreCase("iPhone 11")) {
                basePrice = 800.0;
            } else {
                basePrice = 600.0;
            }
        } else if (make.equalsIgnoreCase("Samsung")) {
            if (model.equalsIgnoreCase("Galaxy S21")) {
                basePrice = 900.0;
            } else if (model.equalsIgnoreCase("Galaxy S20")) {
                basePrice = 750.0;
            } else {
                basePrice = 600.0;
            }
        } else {
            basePrice = 500.0;
        }

        double price = basePrice + (storage - 64) * 10;

        return price;
    }

    // Method to print phone's make, model, and storage capacity
    public void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + " GB");
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("Apple", "iPhone 12", 128);

        double price = phone1.calculatePrice();

        phone1.printDetails();

        System.out.println("Price: " + price);
    }
}

