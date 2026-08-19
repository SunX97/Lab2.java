public class Employee {
    // Private fields for data encapsulation
    private int id;
    private String name;
    private String designation;
    private double salary;

    // Constructor to set employee details
    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    // Getter method for Employee ID
    public int getEmpID() {
        return id;
    }

    // Getter method for Employee Name
    public String getEmployee() {
        return name;
    }

    // Getter method for Employee Designation
    public String getEmpdesignation() {
        return designation;
    }

    // Method to increment salary by 10%
    public void incrementSalary() {
        this.salary += this.salary * 0.10;
        System.out.println("Salary updated successfully! New Salary: $" + this.salary);
    }

    @Override
    public String toString() {
        return "Name: " + getEmployee() + " | Designation: " + getEmpdesignation() + " | Salary: $" + salary;
    }

    // Method to display all individual employee details (reuses toString)
    public void displayDetails() {
        System.out.println("ID: " + id + " | " + toString());
    }
}
