import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class EmployeeDAO {

    // Add Employee
    public void addEmployee(Employee emp) {

        String sql = "INSERT INTO employee(name, department, designation, basic_salary, hra, da, deduction) VALUES(?,?,?,?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, emp.getName());
            ps.setString(2, emp.getDepartment());
            ps.setString(3, emp.getDesignation());
            ps.setDouble(4, emp.getBasicSalary());
            ps.setDouble(5, emp.getHra());
            ps.setDouble(6, emp.getDa());
            ps.setDouble(7, emp.getDeduction());

            ps.executeUpdate();

            System.out.println("Employee Added Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // View Employees
    public void viewEmployees() {

        String sql = "SELECT * FROM employee";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\n========== Employee Details ==========");

            while (rs.next()) {

                System.out.println("ID : " + rs.getInt("id"));
                System.out.println("Name : " + rs.getString("name"));
                System.out.println("Department : " + rs.getString("department"));
                System.out.println("Designation : " + rs.getString("designation"));
                System.out.println("Basic Salary : " + rs.getDouble("basic_salary"));
                System.out.println("HRA : " + rs.getDouble("hra"));
                System.out.println("DA : " + rs.getDouble("da"));
                System.out.println("Deduction : " + rs.getDouble("deduction"));
                System.out.println("--------------------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Search Employee
    public void searchEmployee(int id) {

        String sql = "SELECT * FROM employee WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("\n===== Employee Found =====");

                System.out.println("ID : " + rs.getInt("id"));
                System.out.println("Name : " + rs.getString("name"));
                System.out.println("Department : " + rs.getString("department"));
                System.out.println("Designation : " + rs.getString("designation"));
                System.out.println("Basic Salary : " + rs.getDouble("basic_salary"));
                System.out.println("HRA : " + rs.getDouble("hra"));
                System.out.println("DA : " + rs.getDouble("da"));
                System.out.println("Deduction : " + rs.getDouble("deduction"));

            } else {

                System.out.println("Employee Not Found!");

            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Update Employee Salary
    public void updateEmployee(int id, double salary) {

        String sql = "UPDATE employee SET basic_salary=? WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setDouble(1, salary);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Updated Successfully!");
            } else {
                System.out.println("Employee Not Found!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        String sql = "DELETE FROM employee WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Deleted Successfully!");
            } else {
                System.out.println("Employee Not Found!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}