package club.banyuan;

//基于Cake类和表格，定义两个子类OrderCake和ReadyMadeCake
//OrderCake：属性WeightlnKG，价格计算：price * weight
//readyMadeCake：属性quantity，计算方法：price * quantity
//通过使用定义的类，编写一个应用程序，它将：
//
//声明一个由10个Cake对象组成的数组；
//输入Cake对象的数据并将其存储到数组中；
//显示所有蛋糕的总价；
//显示ReadyMadeCake蛋糕的总价和数量之和；
//显示最高价格出售的蛋糕的信息。
public abstract class Cake {

    protected int id;
    protected double price;

    public Cake(int n, double r) {
        id = n;
        price = r;
    }

    public abstract double calcPrice();

    public String toString() {
        return id + "\t" + price;
    }
}
