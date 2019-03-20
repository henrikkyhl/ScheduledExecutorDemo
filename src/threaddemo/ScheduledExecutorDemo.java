import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class ScheduledExecutorDemo {

    public static void main(String[] args) {
        Runnable task = new RandomNumberGenerator();
        
        // A ScheduledExecutorService is capable of scheduling tasks to run
        // either periodically or once after a certain amount of time has 
        //elapsed.
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(task, 0, 1, TimeUnit.SECONDS);                        
    }
}

class RandomNumberGenerator implements Runnable {
    @Override
    public void run() {
        Random r = new Random();
        System.out.println(r.nextInt(100));
    }
}

