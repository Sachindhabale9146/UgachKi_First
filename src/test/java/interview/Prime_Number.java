package interview;
import	java.util.*;
public class Prime_Number {
	
	boolean PrimeNo;
	public static void main(String args[]) {
		
		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		number = sc.nextInt();
		
		Prime_Number pm = new Prime_Number();
		
		boolean condition = pm.prime_Number(number);
		
		if(condition==true) {
			System.out.println(number +" is Prime Number...!!!");
		}
		else {
			System.out.println("OOPs... "+number +" is not Prime Number...!!!");
		}
	}
	
	public boolean prime_Number(int number) {
		int div=0;
		
		for (int i =1; i<=number;i++) {
			
			if(number%i==0) {
				div++;
			}			
		}
		if (div==2) {
			PrimeNo = true;
		}
		return PrimeNo;
	}
}
