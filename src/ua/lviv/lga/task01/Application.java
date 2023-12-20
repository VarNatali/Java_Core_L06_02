package ua.lviv.lga.task01;

public class Application {
    public static void main(String[] args) {
        Salary hs = new EmployeeHourlySalary("Петро", 49, 129.35);
        Salary fs = new EmployeeFixedSalary("Василь", 20000);

        System.out.println("Працівник " + ((EmployeeHourlySalary) hs).getName() + "  за місяць отримає " + hs.getSalary() + " грн.");
        System.out.println("Працівник " + ((EmployeeFixedSalary) fs).getName() + "  за місяць отримає " + fs.getSalary() + " грн.");
    }
}
