package string_problem;

public class Sum_Of_Digits_Number {

 public static void main(String[] args) {
		int a=123,b=0,c=0;
		
		while(a!=0) {
			
			b= a%10;
			
			c+=b;
			
			a=a-b;
			
			a=a/10;
			
		}
		System.out.println("the sum of all integer number is : " +c);
}
}
