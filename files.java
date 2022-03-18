import  java.util.*;
import  java.io.*;
import java.io.File;
import java.io.IOException;
public class files {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("sample.java");
            int i = 0;
            while (i = file.read() != -1)

                System.out.println((char) i);
        }

        catch (IOException e) {

            System.out.println(e);
        }
    }
}
