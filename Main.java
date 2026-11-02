import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Account a = new Account("Luis-Cruz");
        System.out.println(a.getUsername());
        a = new Account("PSmith");
        System.out.println(a.getUsername());
    }
}