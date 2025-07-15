package pillars;
class Employees {
    String name;
    int employeeID;

    Employees(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    void showDetails() {
        System.out.println("Employee Name: " + name + ", ID: " + employeeID);
    }
}
class FullTimeEmployee extends Employees {
    double salary;
    String benefits;

    FullTimeEmployee(String name, int employeeID, double salary, String benefits) {
        super(name, employeeID);
        this.salary = salary;
        this.benefits = benefits;
    }

    void showSalary() {
        System.out.println("Salary: $" + salary + ", Benefits: " + benefits);
    }
}
class Intern extends Employees {
    double stipend;

    Intern(String name, int employeeID, double stipend) {
        super(name, employeeID);
        this.stipend = stipend;
    }

    void showStipend() {
        System.out.println("Internship Stipend: $" + stipend);
    }
}

class Company {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee("Sandhiya", 101, 60000, "Health Insurance");
        Intern intern1 = new Intern("sandy", 202, 1500);

        emp1.showDetails();
        emp1.showSalary();

        intern1.showDetails();
        intern1.showStipend();
    }
}
