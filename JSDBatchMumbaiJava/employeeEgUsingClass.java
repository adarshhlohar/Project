import java.util.Scanner;

class Employee {
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance;
    double Hra;

    Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
    }

    public void display() {
        System.out.println("The id of employee is: " + employeeId + " name of that employee is : " + employeeName
                + " Address is : " + employeeAddress + " And the phone number is : " + employeePhone);
    }

    public void calculateSalary() {
        double salary = basicSalary + (basicSalary + specialAllowance / 100) + (basicSalary + Hra / 100);
        System.out.println("The Salary of that " + employeeName + " is " + salary);
    }
}

class Manager extends Employee {
    double Salary;

    Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double Salary) {
        super(employeeId, employeeName, employeeAddress, employeePhone);
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeePhone = employeePhone;
        this.employeeAddress = employeeAddress;
        this.Salary = Salary;
    }

    public void display() {
        super.display();
        System.out.println("The salary of manager is  : " + Salary);
    }
}

class Trainee extends Employee {

}

public class employeeEgUsingClass {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the of the Employee");
        long eId = 101l;
        String eName = "Adarsh";
        String eAddress = "Pune";
        long ePhone = 9356986567l;
        double eSalary = 900000;

        Employee Adarsh = new Employee(eId, eName, eAddress, ePhone);
        Adarsh.display();

        Manager Mahesh = new Manager(eId, eName, eAddress, ePhone, eSalary);
        Mahesh.display();
        ;
    }
}