
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class solution5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for( int a = 0; a < num; a++) {
            String string = scanner.next();
            try {
                long number = Long.parseLong(string);
                System.out.println(number + " can be fitted in:");
                if( number <= 1 && number >= 0 ) {
                    System.out.println("* boolean");
                }
                if( number <= Byte.MAX_VALUE && number >= Byte.MIN_VALUE) {
                    System.out.println("* byte");
                }
                if( number <= Short.MAX_VALUE && number >= Short.MIN_VALUE) {
                    System.out.println("* short");
                }
                if( number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE) {
                    System.out.println("* int");
                }
                System.out.println("* long");
            } catch ( Exception e) {
                System.out.println(string + " can't be fitted anywhere.");
                continue;
            }
        }
    }
}