package Pr3;

public class Employee {
    private String fullname = "Full name";
    private double salary = 0;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class Report {
    public Report(Employee[] arr) {

    }
    static void generateReport(Employee[] arr) {
        System.out.println("Отчет: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

