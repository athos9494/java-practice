package club.banyuan;
//编写一个名为Commission的类，它具有以下功能： 它继承Hourly类。 它有两个实例变量（继承的变量除外）：

//1. 该雇员的总销售额（类型为double），
//2. 该雇员的佣金率（佣金率数据类型为double表示百分比佣金，用于计算该员工的销售收入（0.2表示该员工的销售收入为20％的佣金））。
// 构造函数有6个参数：前5个参数与Hourly相同（姓名，地址，电话号码，社会保险号，小时工资率），第6个是员工的佣金率。
// 构造函数应使用前5个参数调用父类的构造函数，然后使用第6个参数来设置佣金率。
//public void addSales（double totalSales），它将参数添加到表示总销售额的实例变量中
//pay方法必须调用父类的pay方法来计算工时的工资，然后再加上销售佣金。 （请参阅Executive类中的pay方法。）
//总销售额应设置为0（注意：不需要将工作小时数设置为0，为什么不设置？）。
//toString方法需要调用父类的toString方法，然后将总销售额添加到该方法中


public class Commission extends Hourly {
    protected double totalsales = 0;
    protected double rateofcommission;
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double rateofcommission) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.rateofcommission = rateofcommission;
    }
    public void addSales(double totalSales){
        this.totalsales = totalSales;



    }

    public double pay(double totalsales,double rateofcommission) {
        double payment = super.pay() + (this.totalsales * rateofcommission);
        return payment;
    }
    public String toString() {
        String result = super.toString();
        result += "\n总销售额：" + totalsales;
        return result;
    }
}
