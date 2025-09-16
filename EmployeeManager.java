import java.util.ArrayList;
import java.util.Scanner;



class employee {
    int id;
    String name;
    String position;
    float salary;

    // Constructor
    employee(int id, String name, float salary , String position) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    // Method to display employee details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary + ", Position: " + position);
    }
}
class menu {
    void showMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add Employee");
        System.out.println("2. Display Employees");
        System.out.println("3. search employee by id");
        System.out.println("4. Exit");
    }

    }
public class EmployeeManager {
    public static void main(String[] args) {
        ArrayList<employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        menu m = new menu();
        int choice;

        do {
            m.showMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Salary: ");
                    float salary = scanner.nextFloat();
                    System.out.print("Enter Position: ");
                    String position = scanner.next();
                    employees.add(new employee(id, name, salary, position));
                    break;
                case 2:
                    System.out.println("Employee List:");
                    for (employee emp : employees) {
                        emp.display();
                    }
                    break;
                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = scanner.nextInt();
                    boolean found = false;
                    for (employee emp : employees) {
                        if (emp.id == searchId) {
                            emp.display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee with ID " + searchId + " not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}