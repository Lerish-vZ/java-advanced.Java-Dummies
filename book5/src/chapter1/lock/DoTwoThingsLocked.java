/* LISTING 1-11*/
package chapter1.lock;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class DoTwoThingsLocked {
    ScheduledThreadPoolExecutor pool = new ScheduledThreadPoolExecutor(2);
}
