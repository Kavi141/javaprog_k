import java.util.*;

class Employee {
    int id;
    String name;
    double basicPay, hra, otherAllowances;

    Employee(int id, String name, double basicPay, double hra, double otherAllowances) {
        this.id = id;
        this.name = name;
        this.basicPay = basicPay;
        this.hra = hra;
        this.otherAllowances = otherAllowances;
    }

    double calculateGrossSalary() {
        return basicPay + hra + otherAllowances;
    }

    double calculateTax(double grossSalary) {
        if (grossSalary > 50000) return grossSalary * 0.2; // 20% tax for salary > 50000
        else if (grossSalary > 30000) return grossSalary * 0.1; // 10% tax for salary > 30000
        else return 0; // No tax for salary <= 30000
    }

    double calculateNetSalary() {
        double grossSalary = calculateGrossSalary();
        double tax = calculateTax(grossSalary);
        return grossSalary - tax;
    }

    void generatePayslip() {
        System.out.println("Payslip for: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Pay: ");
        double basicPay = sc.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();

        System.out.print("Enter Other Allowances: ");
        double otherAllowances = sc.nextDouble();

        Employee emp = new Employee(id, name, basicPay, hra, otherAllowances);
        emp.generatePayslip();

        sc.close();
    }
}
