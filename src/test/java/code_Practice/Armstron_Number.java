package code_Practice;

public class Armstron_Number {

	public static void main(String[] args) {
		
		int a = 370, b=0;
		double sum=0;
		String str = Integer.toString(a);
		int length = str.length();
		int st = a;
		while(a>0) {
			
			b = a%10;
			a = a - b;
			a/=10;
			sum = sum + Math.pow(b, length);
		}
		if(st == sum) {
			System.out.println("yes, given number is Armstrong Number.");
		}
		else {
			System.out.println("nope, given number is not Armstrong number.");
		}
	}
}
