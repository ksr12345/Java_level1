public class Dog {
    // Instance variables
    private final String breed;
    private final int age;
    private final double weight;

    // Constructor
    public Dog(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public int calculateHumanAge() {
        int humanAge;

        if (age <= 2) {
            humanAge = age * 11;
        } else {
            humanAge = 22 + ((age - 2) * 5);
        }

        return humanAge;
    }

    public void printDetails() {
        System.out.println("Breed: " + breed);
        System.out.println("Age (in dog years): " + age);
        System.out.println("Weight: " + weight + " kg");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Labrador Retriever", 3, 25.5);


        int humanAge = dog1.calculateHumanAge();

        dog1.printDetails();

        System.out.println("Age in human years: " + humanAge);
    }
}

