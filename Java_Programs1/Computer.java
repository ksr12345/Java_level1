public class Computer {
    private final String processor;
    private final int RAM;
    private final int storage;

    public Computer(String processor, int RAM, int storage) {
        this.processor = processor;
        this.RAM = RAM;
        this.storage = storage;
    }

    public double calculatePrice() {
        double basePrice = 0.0;

        if (processor.equalsIgnoreCase("Intel") && RAM >= 8) {
            basePrice = 800.0;
        } else if (processor.equalsIgnoreCase("AMD") && RAM >= 8) {
            basePrice = 700.0;
        } else {
            basePrice = 500.0;
        }

        double price = basePrice + (storage - 256) * 0.5; // Assume $0.5 for every additional 1 GB

        return price;
    }

    public void printDetails() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + RAM + " GB");
        System.out.println("Storage: " + storage + " GB");
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer("Intel", 16, 512);

        double price = computer1.calculatePrice();

        computer1.printDetails();
        System.out.println("Price: " + price);
    }
}

