package chapter3;

public class QuickSortApp {
    public static void main(String[] args) {
        int LEN = 100;
        int[] unsorted = new int[LEN];

        for(int i = 0; i < LEN; i++){
            unsorted[i] = (int)(Math.random() * 100) + 1;
        }
    }
}
