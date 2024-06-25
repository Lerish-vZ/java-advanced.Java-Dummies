package chapter1.version1;

public class CountDownApp {
    public static void main(String[] args) {
        Thread clock = new CountDownClock(); //creates Thread object but doesn't begin executing until you call its start method
        clock.start();
    }
}
