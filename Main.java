class Employee {
    String name;
    int hours;
    void setEmployee(String n, int h) {
        name = n;
        hours = h;
    }
    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Working Hours: " + hours);
    }
}
class Manager extends Employee {

    double salary;
    void setSalary(double s) {
        salary = s;
    }
    void displayManager() {
        System.out.println("Manager Salary: " + salary);
    }
}
public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setEmployee("kavya", 8);   
        m.setSalary(50000);         
        m.displayEmployee();
        m.displayManager();
    }
}
