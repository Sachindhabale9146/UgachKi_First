package code_Practice;

public class Fibonacci_Searise {

	public static void main(String[] args) {
		
//		0,1,1,2,3,5,8
		int Fibonacci_Series=0,a=-1,b=1;
		for(int i=0;i<=10;i++) {
			
			Fibonacci_Series = a + b;  // a + b =Fibonacci_Series
			a=b;
			b=Fibonacci_Series;
			System.out.println(Fibonacci_Series);
		}
	}
}
