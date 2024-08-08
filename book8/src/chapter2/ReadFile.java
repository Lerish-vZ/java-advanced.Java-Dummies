package chapter2;

import java.io.*;
import java.text.NumberFormat;

public class ReadFile {
    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getInstance();
        BufferedReader in = getReader("movies.txt");
        Movies movie = readMovie(in);

        while (movie != null) {
            String msg = Integer.toString(movie.year);
            msg +=  ": " + movie.title;
            msg += " (" + cf.format(movie.price) + ")";
            System.out.println(msg);
            movie = readMovie(in);
        }
    }

    private static BufferedReader getReader(String name){
        BufferedReader in = null;

        try{
            File file = new File(name);
            in = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
            System.exit(0);
        }
        return in;
    }
}
