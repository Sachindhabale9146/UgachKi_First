package interview;
import java.util.*;
public class Palindrom_Number {

	public static void main(String[] args) {

		int a,dig=0,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter the number");
		
		a = sc.nextInt();
		int original =a;
		while(a>0) {
			
			dig = a%10;
			sum = sum * 10;
			sum = sum + dig;
			
			a = a-dig;
			a = a/10;
			
		}
				
		if (original == sum) {
			System.out.println( original +" the number is palindrom number");
		}
		else {
			System.out.println(original +" the number is not palindrome number");
		}
		
	}
}
