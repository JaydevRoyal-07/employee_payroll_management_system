public class PayrollService {

    public double calculateGrossSalary(Employee emp) {

        return emp.getBasicSalary() + emp.getHra() + emp.getDa();
    }

    public double calculateNetSalary(Employee emp) {

        return calculateGrossSalary(emp) - emp.getDeduction();
    }

    public void displaySalary(Employee emp) {

        double gross = calculateGrossSalary(emp);
        double net = calculateNetSalary(emp);

        System.out.println("\n========== Salary Details ==========");
        System.out.println("Employee Name : " + emp.getName());
        System.out.println("Basic Salary  : " + emp.getBasicSalary());
        System.out.println("HRA           : " + emp.getHra());
        System.out.println("DA            : " + emp.getDa());
        System.out.println("Deduction     : " + emp.getDeduction());
        System.out.println("------------------------------------");
        System.out.println("Gross Salary  : " + gross);
        System.out.println("Net Salary    : " + net);
    }
}