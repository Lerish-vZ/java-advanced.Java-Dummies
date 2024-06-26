/* LISTING 1-7 */
package chapter1.newThreading;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class CountDownApp {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor pool = new ScheduledThreadPoolExecutor(25);

        Runnable flood, ignition, liftoff;
        flood = new LaunchEvent("Flood the pad!");
        ignition = new LaunchEvent("Start engines!");
        liftoff = new LaunchEvent("Liftoff!");

        for (int t = 20; t > 0; t--) {
            pool.schedule(new CountDownClock(t), (long)(20-t), TimeUnit.SECONDS);
            pool.schedule(flood, 3L, TimeUnit.SECONDS);
            pool.schedule(ignition, 13L, TimeUnit.SECONDS);
            pool.schedule(liftoff, 19L, TimeUnit.SECONDS);

            pool.shutdown();
        }

    }
}
