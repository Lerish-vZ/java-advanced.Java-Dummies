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

    interface TimeMonitor {
        int getTime();
    }

    class CountDownClock extends Thread implements TimeMonitor {
        private int t;

        public CountDownClock(int start) {
            this.t = start;
        }

        public void run() {
            for (; t >= 0; t--) {
                System.out.println("T minus " + t);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {}
            }
        }

        public int getTime() {
            return t;
        }
    }

    class LaunchEvent implements Runnable {
        private int start;
        private String message;

        TimeMonitor tm;

        public LaunchEvent(int start, String message, TimeMonitor monitor){
            
        }
    }
}
