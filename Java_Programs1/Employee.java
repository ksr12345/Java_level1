public class Employee {
    private final String name;
    private final int salary;
    private String ID;

    public Employee(String name, int salary, String ID) {
        this.name = name;
        this.salary = salary;
        this.ID = ID;
    }

    public void YearlySalary() {
        System.out.println("Yearly Salary: " + salary*12);
    }

    public void printNameAndSalary() {
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: " + salary);
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 20000, "S12345");

        employee1.printNameAndSalary();
        employee1.YearlySalary();

        System.out.println("Employee ID: " + employee1.getID());
        employee1.setID("S54321");
        System.out.println("Updated Employee ID: " + employee1.getID());
    }
}
