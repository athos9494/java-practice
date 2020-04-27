import java.util.Scanner;
public class RandomNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plz enter first num:");
        int from = sc.nextInt();
        System.out.println("plz enter second num:");
        int to = sc.nextInt();
        int res = randomInt(from,to);
        System.out.println(res);
    }
    public static int randomInt(int from,int to){
        int random = (int)(Math.random()*(to - from + 1) + from);//Math.random随机选取的是0-1之间的double值
        return random;

    }
}