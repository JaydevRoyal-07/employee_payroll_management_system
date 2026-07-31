import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();
        PayrollService payroll = new PayrollService();

        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println(" EMPLOYEE PAYROLL MANAGEMENT SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Calculate Salary");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Enter Designation: ");
                    String des = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double basic = sc.nextDouble();

                    System.out.print("Enter HRA: ");
                    double hra = sc.nextDouble();

                    System.out.print("Enter DA: ");
                    double da = sc.nextDouble();

                    System.out.print("Enter Deduction: ");
                    double deduction = sc.nextDouble();

                    Employee emp = new Employee(name, dept, des,
                            basic, hra, da, deduction);

                    dao.addEmployee(emp);

                    break;

                case 2:

                    dao.viewEmployees();

                    break;

                case 3:

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();

                    dao.searchEmployee(id);

                    break;
                                case 4:

                    System.out.print("Enter Employee ID: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter New Basic Salary: ");
                    double salary = sc.nextDouble();

                    dao.updateEmployee(updateId, salary);

                    break;

                case 5:

                    System.out.print("Enter Employee ID: ");
                    int deleteId = sc.nextInt();

                    dao.deleteEmployee(deleteId);

                    break;

                case 6:

                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String empName = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double bs = sc.nextDouble();

                    System.out.print("Enter HRA: ");
                    double h = sc.nextDouble();

                    System.out.print("Enter DA: ");
                    double d = sc.nextDouble();

                    System.out.print("Enter Deduction: ");
                    double ded = sc.nextDouble();

                    Employee e = new Employee(empName,
                            "", "", bs, h, d, ded);

                    payroll.displaySalary(e);

                    break;

                case 7:

                    System.out.println("Thank You!");

                    break;

                default:

                    System.out.println("Invalid Choice!");

            }

        } while (choice != 7);

        sc.close();
    }
}