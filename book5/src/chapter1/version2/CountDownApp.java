/* LISTING 1-3 */
package chapter1.version2;

import chapter1.version1.CountDownClock;
import chapter1.version1.LaunchEvent;

public class CountDownApp {
    public static void main(String[] args) {
        Thread clock = new CountDownClock();
        Runnable flood, ignition, liftoff;
        flood = new LaunchEvent(16, "Flood the pad!");
        ignition = new LaunchEvent(6, "Start engines!");
        liftoff = new LaunchEvent(0, "Liftoff!");

        clock.start();

        new Thread(flood).start();
        new Thread(ignition).start();
        new Thread(liftoff).start();

        /*
        Thread clock = new CountDownClock();
        ArrayList<Runnable> events = new ArrayList<Runnable>();
        events.add(new LaunchEvent(16, "Flood the pad!"));
        events.add(new LaunchEvent(6, "Start engines!"));
        events.add(new LaunchEvent(0, "Liftoff!"));
        clock.start();
        for (Runnable e : events)
        new Thread(e).start();
        */

    }
}
