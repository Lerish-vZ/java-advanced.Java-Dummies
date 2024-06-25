/* LISTING 1-4 */
package chapter1.version3;

import chapter1.version1.CountDownClock;
import chapter1.version1.LaunchEvent;

import java.util.ArrayList;

public class CountDownApp {
    public static void main(String[] args) {
        CountDownClock clock = new CountDownClock(20);
        ArrayList<Runnable> events = new ArrayList<>();

        events.add(new LaunchEvent(16, "Flood the pad!", clock));
        events.add(new LaunchEvent(6, "Start Engines!", clock));
        events.add(new LaunchEvent(0, "Liftoff!", clock));

        clock.start();

        for (Runnable e : events) {
            new Thread(e).start();
        }
    }
}
