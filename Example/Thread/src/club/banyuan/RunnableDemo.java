package club.banyuan;

public class RunnableDemo implements Runnable {
    String demoName ;
    public RunnableDemo(String name){
        demoName = name;
        System.out.println("Creating Thread");
    }
    Thread t ;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println("Thread is running");
        }

    }
}
class Test {
    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo("thread");
        Thread thread = new Thread(runnableDemo);
        thread.start();
    }
}
