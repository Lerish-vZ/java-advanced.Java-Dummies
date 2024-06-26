package chapter1.version3;

public class CountDownClock extends Thread implements CountDownApp.TimeMonitor {
    private int t;

    public CountDownClock(int start) {
        this.t = start;
    }

    public void run() {
        for (; t >= 0; t--) {
            System.out.println("T minus " + t);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

    public int getTime() {
        return t;
    }
}
