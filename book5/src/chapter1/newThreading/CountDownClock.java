/* LISTING 1-5 */
package chapter1.newThreading;

public class CountDownClock implements Runnable{
    int t;

    public CountDownClock(int t){
        this.t = t;
    }

    public void run(){
        System.out.println("T minus " + t);
    }
}
