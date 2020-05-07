package club.banyuan;

import java.util.concurrent.Callable;
public class Main{
    public  static Cake[] CreateCake()
    {
        
        Cake []cakes = new Cake[10];
        
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
        return cakes;

    }
    public static void  allPrice(Cake []cakes){
        double allp = 0;
        for (int i = 0;i < 10 ;i++)
        {
            allp = cakes[i].calcPrice() + allp;
        }

         System.out.println("所有蛋糕的总价是：" +allp);
    }
    public static void maxPrice(Cake []cakes){
        double max = cakes[0].calcPrice();
        for (int i = 0 ;i< 10 ;i++)
        {
            if (cakes[i].calcPrice()>max){
                max = cakes[i].calcPrice();
            }
        }
        System.out.println("蛋糕价格最高的是：" + max);

    }
    public static void  allReadyMadeCakePrice(){
        System.out.println("所有ReadyMadeCake的总价是:");
    }
    public static void allReadyMadeCakecount(){
        System.out.println("所有ReadyMadeCake的数量是：");
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

        Cake []cakes = CreateCake();
        allPrice(cakes);
        maxPrice(cakes);
        allReadyMadeCakecount();
        allReadyMadeCakePrice();

    }
}
