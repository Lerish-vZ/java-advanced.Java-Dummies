/* LISTING 1-2 */
package chapter1.version1;

public class LaunchEvent implements Runnable {
    private int start;
    private String message;

    public LaunchEvent(int start, String message) {
        this.start = start;
        this.message = message;
    }

    public void run() {
        try {
            Thread.sleep(20000 - (start * 1000)); //the countdown clock starts at 20 sec (20000 millisec.), meaning you can choose the desired statring time. Example if start = 6 sec the sleep method sleeps for 14000 milisec.
        } catch (InterruptedException e) {
        }
        System.out.println(message);
    }
}
