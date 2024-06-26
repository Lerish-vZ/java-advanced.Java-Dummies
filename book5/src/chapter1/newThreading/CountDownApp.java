/* LISTING 1-7 */
package chapter1.newThreading;

import java.util.concurrent.ScheduledThreadPoolExecutor;

class CountDownApp {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(25);

        Runnable flood, ignition, liftoff;
        flood = new LaunchEvent("Flood the pad!");
        ignition = new LaunchEvent("Start engines!");
        liftoff = new LaunchEvent("Liftoff!");


        
    }
}
