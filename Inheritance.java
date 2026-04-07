class Employee {
    String name;   
}

class PermanentEmployee extends Employee {
    double basicSalary;
    double bonus;
}

class ContractEmployee extends Employee {
    double hoursWorked;
    double ratePerHour;
}

public class Inheritance {
    public static void main(String[] args) {
        PermanentEmployee p = new PermanentEmployee();
        p.name = "Akshaya";
        p.basicSalary = 30000;
        p.bonus = 5000;

        ContractEmployee c = new ContractEmployee();
        c.name = "Sudha";
        c.hoursWorked = 100;
        c.ratePerHour = 200;

        System.out.println("Permanent Employee: " + p.name);
        System.out.println("Contract Employee: " + c.name);
    }
}