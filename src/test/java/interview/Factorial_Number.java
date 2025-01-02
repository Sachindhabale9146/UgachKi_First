package interview;
import java.util.*;
public class Factorial_Number {

	public static void main(String[] args) {
		
		int number,mult;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("pls enter the number : ");
		
		number = sc.nextInt();
		
		for(int j=1;j<=number;j++) {
			mult=1;
			for(int i=1;i<=j;i++) {
			
				mult = mult * i;
			}
			
			System.out.println(j+ "!" + " = " +mult);
		}
	}
}
