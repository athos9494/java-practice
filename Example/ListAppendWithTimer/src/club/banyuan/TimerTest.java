package club.banyuan;

public class TimerTest implements Timer{
    long currentTime = 0;
    long stopTime = 0;
    boolean isStart;
    @Override
    public void start() throws IllegalStateException {
        if (isStart){
            throw  new IllegalStateException();
        }
        reset();
        currentTime = System.currentTimeMillis();
        isStart = true;
    }

    @Override
    public void stop() throws IllegalStateException {
        if(!isStart)
        {
            throw new IllegalStateException();
        }
        stopTime = System.currentTimeMillis();
        isStart = false;

    }

    @Override
    public void reset() {
        currentTime = 0;
        stopTime = 0;
        isStart = false;

    }

    @Override
    public long getTimeMillisecond() {
        return stopTime - currentTime;
    }
}
