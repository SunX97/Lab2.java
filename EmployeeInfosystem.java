import java.util.Scanner;
import java.util.ArrayList;

public class EmployeeInfosystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> emp = new ArrayList<>();

        System.out.print("Enter initial number of employees: ");
        int n = Integer.parseInt(sc.nextLine());

        // Initial data collection
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");
            addNewEmployee(sc, emp);
        }

        int choice;
        do {
            System.out.println("\n--- Employee Information System Menu ---");
            System.out.println("1. Display All Employees");
            System.out.println("2. Add New Employee");
            System.out.println("3. Delete Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("\n--- Displaying All Employees ---");
                    if (emp.isEmpty()) {
                        System.out.println("No employee records found.");
                    } else {
                        for (Employee e : emp) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n--- Add New Employee ---");
                    addNewEmployee(sc, emp);
                    break;
                case 3:
                    System.out.println("\n--- Delete Employee ---");
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = Integer.parseInt(sc.nextLine().trim());
                    boolean removed = false;

                    // Loop backwards or use iterator to safely remove items while iterating
                    for (int i = 0; i < emp.size(); i++) {
                        if (emp.get(i).getEmpID() == deleteId) {
                            emp.remove(i);
                            System.out.println("Employee with ID " + deleteId + " removed successfully.");
                            removed = true;
                            break; // Exit loop after finding the match
                        }
                    }
                    if (!removed) {
                        System.out.println("Employee with ID " + deleteId + " not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }

    // Helper method to handle safer line-by-line inputs for adding an employee
    private static void addNewEmployee(Scanner sc, ArrayList<Employee> emp) {
        System.out.print("Enter ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Designation: ");
        String desi = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = Double.parseDouble(sc.nextLine());

        emp.add(new Employee(id, name, desi, salary));
        System.out.println("Employee added successfully!");
    }
}
