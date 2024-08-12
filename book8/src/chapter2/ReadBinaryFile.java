package chapter2;

import java.io.*;
import java.text.NumberFormat;

public class ReadBinaryFile {
    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        DataInputStream in = getStream("C:\\YourJavaDirectory\\movies.dat");
        boolean eof = false;

        while (!eof) {
            Movie movie = readMovie(in);

            if(movie = null)
                eof = true;
            else {
                String msg = Integer.toString(movie.year);
                msg += ": " + movie.title;
                msg += " (" + cf.format(movie.price) + ")";
                System.out.println(msg);
            }
        }
        closeFile(in);
    }
}
