public class Employee {

    private int id;
    private String name;
    private String department;
    private String designation;
    private double basicSalary;
    private double hra;
    private double da;
    private double deduction;

    public Employee() {
    }

    public Employee(String name, String department, String designation,
                    double basicSalary, double hra, double da, double deduction) {
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.da = da;
        this.deduction = deduction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public double getDa() {
        return da;
    }

    public void setDa(double da) {
        this.da = da;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }
}
