package ua.lviv.lga.task01;

public class EmployeeHourlySalary implements Salary {
    private double h;
    private double tax;
    private String name;

    public EmployeeHourlySalary(String name, double h, double tax) {
        this.name = name;
        this.h = h;
        this.tax = tax;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getSalary() {
        return (this.h * this.tax - this.h * this.tax * 0.2);
    }
}
