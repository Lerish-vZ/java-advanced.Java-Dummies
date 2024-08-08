package chapter2;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        Movie[] movies = getMovies();
        PrintWriter out = openWriter("C:\\YourJavaDirectory\\movies2.txt");

        for(Movie m : movies)
            writeMovie(m, out);
        out.close();
    }
}
