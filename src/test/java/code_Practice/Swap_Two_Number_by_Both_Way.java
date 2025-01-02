package code_Practice;

import org.testng.annotations.Test;

public class Swap_Two_Number_by_Both_Way {

	public static void main(String[] args) {
		
		int a=2,b=3,c=0;
		
		c=a;
		a=b;
		b=c;
		System.out.println("a = "+a+"\n"+"b = "+b);
	}
	@Test
	public static void withoutThirdNumber() {
		
		int a=4,b=6;
		a=a+b;
		b = a-b;
		a = a-b;
		System.out.println("a = "+a+"\n"+"b = "+b);
	}
}
