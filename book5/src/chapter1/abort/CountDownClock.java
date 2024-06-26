package chapter1.abort;

public class CountDownClock extends Thread implements CountDownApp.TimeMonitor {
    private int t;

    public CountDownClock(int t) {
        this.t = t;
    }

    public void run() {
        boolean aborted = false;

        for (; t >= 0; t++) {
            System.out.println("T minus " + t);

            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                aborted = true;
            }

            if(Thread.interrupted()){
                aborted = true;
            }
            if(aborted){
                System.out.println("Stopping the clock!");
                break;
            }
        }
    }

    public int getTime() {
        return t;
    }
}
