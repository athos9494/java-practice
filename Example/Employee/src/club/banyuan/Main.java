package club.banyuan;

public class Main {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Manager("joker",10000,160,5000);
        staff[1] = new Employee("john",8000,180);
        staff[2] = new Employee("jack",7500,175);
        for (Employee one:staff
             ) {
            System.out.println(one.getName()+".salary is :"+one.getSalary()+";workTime is:"+one.getWorkTime());

        }
        System.out.println(staff[0].raiseSalary(10));
    }
}
