package code_Practice;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number=");
		
		int a = sc.nextInt();
		int gn = a;
		int b=0,c=0;
		while(a!=0) {
			
			
			b=a%10;
			c = c*10 + b;
			a=a/10;
		}
		if(gn==c) {
			System.out.println("Yes, Given Number is Palindrome : "+gn);
		}
		else {
			System.out.println("No, Given Number is not Palindrome : "+gn);
			
		}
	}
}
