package chapter2;

import java.io.*;

public class WriteBinaryFile {
    public static void main(String[] args) {
        Movie[] movies = getMovies();
        DataOutputStream out = openOutputStream("C:\\YourJavaDirectory\\movies.dat");

        for (Movie m : movies)
            writeMovie(m, out);
        closeFile(out);
    }

    
}
