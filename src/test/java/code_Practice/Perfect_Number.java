package code_Practice;

public class Perfect_Number {

	public static void main(String[] args) {
		
		int a =19,sum=0;
		int b=a;
		while(a>0) {
			
			int c =a%10;
			a = a - c;
			a=a/10;
			sum = sum +c;
		}
		if(b%sum==0) {
			System.out.println("Given number is Perfect Number : "+b);
		}
		else {
			System.out.println("Given number is not perfect number : "+b);
		}
	}
}
