package javaapplication3;
import java.util.*;

public class JavaApplication3 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int C = scanner.nextInt();
        if ((A + C) % 2 == 0) {
            int B = (A + C) / 2;
            System.out.println("Yes,integer B exists.");
            System.out.println("B = " + B);
        } else {
            System.out.println("No,integer B does not exist.");
        }
    }
}