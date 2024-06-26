/* LISTING 1-6 */
package chapter1.newThreading;

public class LaunchEvent implements Runnable {
    private String message;

    public LaunchEvent(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println(message);
    }
}
