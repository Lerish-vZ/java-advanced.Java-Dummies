/* LISTING 1-8 */
package chapter1.lock;

import chapter1.newThreading.CountDownClock;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class DoTwoThings {
    ScheduledThreadPoolExecutor pool = new ScheduledThreadPoolExecutor(2);
    CountDownClock clock = new CountDownClock(20);

    public static void main(String[] args) {
        new DoTwoThings();
    }

    DoTwoThings() {
        pool.execute(clock);
        pool.execute(clock);
        pool.shutdown();
    }
}
