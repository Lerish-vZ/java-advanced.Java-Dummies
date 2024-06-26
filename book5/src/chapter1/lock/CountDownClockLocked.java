/*  LISTING 1-12 */
package chapter1.lock;

import java.util.concurrent.locks.ReentrantLock;

public class CountDownClockLocked extends Thread {
    ReentrantLock lock = new ReentrantLock();

    public void run() {
        lock.lock();

        for (int t = 20; t >= 0; t--) {
            System.out.println("T minus " + t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        lock.unlock();
    }
}

/*
The lock object declared at the top is an instance of the ReentrantLock class and makes that only one thread can have the lock object at a time.
The lock.lock() gives access to one thread and doesn't allow any other thread access to the locked object.
The object only becomes available to another thread when the access thread reaches lock.unlock().
After the first thread calls lock.unlock(), the second thread proceeds into the method's for loop.
*/