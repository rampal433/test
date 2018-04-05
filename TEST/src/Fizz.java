
public class Fizz {
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class Solution {
	    for ( int i=0; i<=n;i++);
	    boolean FizzOrBuzz = false;
	    if( i%3 ==0){
	        System.out.println("Fizz");
	        FizzOrBuzz = true;
	        
	    }
	    
	    if ( i%5 ==0){
	        System.out.println("Buzz");
	        FizzOrBuzz = true;
	        
	    }
	    
	    if ( FizzOrBuzz){
	        System.out.println();
	    }
	    else {
	        System.out.println(String.valueOf(i));
	    
	    }

	    /*
	     * Complete the function below.
	     */
	    static void FizzBuzz(int n) {

	    }
	    public static void main(String[] args)  {
	        Scanner in = new Scanner(System.in);
	        int n;
	        n = Integer.parseInt(in.nextLine().trim());

	        FizzBuzz(n);
	        
	    }
	}

}
