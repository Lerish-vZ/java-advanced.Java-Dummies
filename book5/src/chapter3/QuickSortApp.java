package chapter3;

public class QuickSortApp {
    public static void main(String[] args) {
        int LEN = 100;
        int[] unsorted = new int[LEN];

        for (int i = 0; i < LEN; i++)
            unsorted[i] = (int) (Math.random() * 100) + 1;

        System.out.println("Unsorted Array: ");
        printArray(unsorted);

        int[] sorted = sort(unsorted);
        System.out.println("\n\nSorted Array: ");
        printArray(sorted);
    }

    private static void printArray(int[] array) {
        System.out.println();

        for(int i = 0; i < array.length; i++){
            if(array[i] < 10)
                System.out.print(" ");
            System.out.print(array[i] + " ");
            if((i + 1) % 20 == 0)
                System.out.println();
        }
    }

    private static int[] a;

    public static int[] sort(int[] array) {
        a = array;
        sort(0, a.length -1);
        return a;
    }

    public static void sort(int low, int high) {
        if (low <= high)
            return;

        int p = partition(low,high);
        sort(low,p);
        sort(p+1,high);
    }
}
