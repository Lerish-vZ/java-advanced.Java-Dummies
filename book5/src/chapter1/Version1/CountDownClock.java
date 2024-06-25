/* LISTING 1-1 */
package chapter1.version1;

public class CountDownClock extends Thread {
    public void run() { //This method is called by Java when the clock thread has been started. All processing done by the thread must be either in the run method or in some other method called by the run method.
        for (int t = 20; t >= 0; t--) {
            System.out.println("T minus " + t);

            try {
                Thread.sleep(1000); // 1 second
            } catch (InterruptedException e) {

            }
        }
    } //At some point in its execution, the run method must either call sleep or yield to give other threads a chance to execute
}
