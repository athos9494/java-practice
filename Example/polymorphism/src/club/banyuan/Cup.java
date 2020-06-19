package club.banyuan;

public class Cup {
    private int water = 0;
    public void addWater (int water){
        this.water = this.water + water;
    }
    public void drinkWater(int water){
        this.water = this.water - water;
    }
}
class BrokenCup extends Cup{
    @Override
    public void addWater(int water) {
        System.out.println("holy shit,broken cup");
    }

    @Override
    public void drinkWater(int water) {
        System.out.println("emmm,broken cup");
    }
}
class Test{
    public static void main(String[] args) {
        Cup aCup;
        BrokenCup brokenCup = new BrokenCup();
        aCup = brokenCup;
        aCup.addWater(10);
    }
}