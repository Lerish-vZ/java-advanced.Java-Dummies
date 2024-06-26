package chapter1.version3;

public class LaunchEvent implements Runnable {
    private int start;
    private String message;

    CountDownApp.TimeMonitor tm;

    public LaunchEvent(int start, String message, CountDownApp.TimeMonitor monitor) {
        this.start = start;
        this.message = message;
        this.tm = monitor;
    }

    public void run() {
        boolean eventDone = false;

        while (!eventDone) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }

            if (tm.getTime() <= start) {
                System.out.println(this.message);
                eventDone = true;
            }
        }
    }
}
