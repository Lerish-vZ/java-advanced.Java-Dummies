package chapter1;

import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;

public class FileVisitorDemo {
    public static void main(String[] args) {
        Path start = Paths.get("c:\\Windows\\System32");
        MyFileVisitor visitor = new MyFileVisitor();

        try {
            Files.walkFileTree(start, visitor);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    
}
