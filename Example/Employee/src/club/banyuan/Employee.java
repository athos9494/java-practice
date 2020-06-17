package club.banyuan;

public class Employee {
    private String name;
    private double Salary;
    private double workTime;

    public Employee(String name, double salary, double workTime){
        this.name = name;
        this.Salary = salary;
        this.workTime = workTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public double getSalary() {
        return Salary;
    }

    public void setWorkTime(double workTime) {
        this.workTime = workTime;
    }

    public double getWorkTime() {
        return workTime;
    }
    public double raiseSalary(double percent){
        double newSalary= getSalary()*(1+percent/100);
        return newSalary;
    }
}
