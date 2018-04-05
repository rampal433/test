
public class solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for ( int i=1; i<=100; i++)
		{
			if (i%15 == 0) {
				System.out.println("FIZZBUZZ");
			} else if (i%5 == 0 ) {
				System.out.println("BUZZ");
			} else if ( i%3 == 0) {
				System.out.println("FIZZ");
			
			}System.out.println(String.valueOf(i));
		}
	
	}

}
