package chapter3;

import java.io.File;
import java.util.Scanner;

public class DirList {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Welcome to the Directory Lister");

        do {
            System.out.print("\nEnter a path: ");
            String path = sc.nextLine();
            File dir = new File(path);

            if(!dir.exists() || !dir.isDirectory())
                System.out.println("\nThat directory does not exist.");
            else {
                System.out.println("\nListing directory tree of:");
                System.out.println(dir.getPath());
                listDirectories(dir, " ");
            }
        } while(askAgain());
    }

    private static void listDirectories(File dir, String indent) {

    }
}
