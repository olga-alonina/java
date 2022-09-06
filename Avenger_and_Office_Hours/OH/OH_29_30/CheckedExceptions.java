package OH.OH_29_30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        // Thread.sleep(3000);
        // FileInputStream fileInputStream=new FileInputStream("path");


        System.out.println("Before Read File ");
        waitFor(3);
        readFromFile("path");
        waitFor(3);
        System.out.println("After Read File ");

    }

    public  static void waitFor(int second) {

        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public  static void readFromFile(String path) throws FileNotFoundException {
        // Option 1 with try catch
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException is handled");;
        }

        // Option 2 with throws
        FileInputStream fileInputStream=new FileInputStream(path);

    }
}