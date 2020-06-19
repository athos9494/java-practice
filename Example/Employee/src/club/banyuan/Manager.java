package club.banyuan;

public class Manager extends Employee {
    private double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public Manager(String name, double salary, double workTime, double bonus) {
        super(name, salary, workTime);
        this.bonus = bonus;
    }

    @Override
    public double raiseSalary(double percent) {
        return super.raiseSalary(percent);
    }

    @Override
    public double getSalary() {
        return super.getSalary() + getBonus();
    }
}
