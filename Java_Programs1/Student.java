public class Student {
    private final String name;
    private final int age;
    private String ID;

    public Student(String name, int age, String ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public void printNameAndAge() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public String getID() {
        return ID;
    }


    public void setID(String ID) {
        this.ID = ID;
    }

    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 20, "S12345");

        student1.printNameAndAge();

        System.out.println("Student ID: " + student1.getID());
        student1.setID("S54321");
        System.out.println("Updated Student ID: " + student1.getID());
    }
}

