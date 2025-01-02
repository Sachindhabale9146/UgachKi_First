package code_Practice;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("Yes, Entered Number Is Prime Number : "+i);
			}
//			else {
//				System.out.println("No, Entered Number Is Not Prime Number : "+i);
//			}
		}
		
		
	}
}
