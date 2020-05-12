package club.banyuan;

//输出：燕子能飞1000米
public class Main {

    public static void show(Bird bird) {
        System.out.println(bird.getName() + "能够飞 " + bird.fly() + "米");
    }

    public static void main(String[] args) {

        show(new Bird() {
            @Override
            public int fly() {
                return 1000;
            }

            @Override
            public String getName() {
                return "燕子";
            }

            //TODO
        });

    }
}
