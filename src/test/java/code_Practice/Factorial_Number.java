package code_Practice;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		
		int n = sc.nextInt();
		int a =1;
		while(n>0) {
			
			a=a*n;
			n--;
		}
		System.out.println("this is the factorial of given number : "+a);
	}
}
