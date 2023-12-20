package ua.lviv.lga.task01;

public class EmployeeFixedSalary implements Salary {
    private String name;
    private double sal;

    public EmployeeFixedSalary(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public double getSalary() {
        return (this.sal - this.sal * 0.2);
    }


}
