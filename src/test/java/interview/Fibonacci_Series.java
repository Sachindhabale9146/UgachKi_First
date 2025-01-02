package interview;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
//		fibonacci series means the addition of previous two number
		int b=1,a=-1;
		for(int i=0;i<20;i++) {
			int c;
			
			c = a + b;
			System.out.println("Fibonacci Series : "+c);
			a=b;
			b=c;
			
//	-1b + 1a=0c		
//	    0b+1a=1c
//		  1b+1a=2c
//			2b + 1a=3c
//			3c +2a
		}
	}
}
