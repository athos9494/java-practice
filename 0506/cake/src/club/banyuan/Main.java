package club.banyuan;

import java.util.concurrent.Callable;
public class Main{
    static Cake []cakes = new Cake[10];
    {
        cakes[0] = new OrderCake(0,10,3);
        cakes[1] = new OrderCake(1,20,3);
        cakes[2] = new OrderCake(2,30,5);
        cakes[3] = new OrderCake(3,20,4);
        cakes[4] = new OrderCake(4,10,3);
        cakes[5] = new ReadyMadeCake(5,10,1);
        cakes[6] = new ReadyMadeCake(6,20,1);
        cakes[7] = new ReadyMadeCake(7,30,1);
        cakes[8] = new ReadyMadeCake(8,20,1);
        cakes[9] = new ReadyMadeCake(9,10,1);
    }
    public static double allPrice(){

         return 0;
    }
    public static double  maxPrice(){

        return 0;
    }
    public static double allReadyMadeCakePrice(){
        return 0;
    }
    public static double allReadyMadeCakecount(){
        return 0;
    }
    public static void main(String[] args) {
        //Cake []cakes = new Cake[10];
        //cakes[0] = new OrderCake(0,10,3);
        //cakes[1] = new OrderCake(1,20,3);
        //cakes[2] = new OrderCake(2,30,5);
        //cakes[3] = new OrderCake(3,20,4);
        //cakes[4] = new OrderCake(4,10,3);
        //cakes[5] = new ReadyMadeCake(5,10,1);
        //cakes[6] = new ReadyMadeCake(6,20,1);
        //cakes[7] = new ReadyMadeCake(7,30,1);
        //cakes[8] = new ReadyMadeCake(8,20,1);
        //cakes[9] = new ReadyMadeCake(9,10,1);


        System.out.println("所有蛋糕的总价是：" + allPrice());

        System.out.println("ReadyMadeCake蛋糕的总价是：" + allReadyMadeCakePrice()+ "数量是："+allReadyMadeCakecount());

        System.out.println("所有蛋糕中单价最高的蛋糕是："+ maxPrice());

    }
}
