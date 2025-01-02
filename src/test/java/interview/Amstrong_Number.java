package interview;

import java.util.*;

public class Amstrong_Number {
	
	double sum;
	
	public static void main(String args[]) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the Number : ");
		
		num = sc.nextInt();
		
		Amstrong_Number  obj = new Amstrong_Number();
		
		obj.validate_Number_Is_Amstrong_Or_Not(num);
		
		
	}
	
	public void validate_Number_Is_Amstrong_Or_Not(int num2) {
		
		int digit=0, dig,temp=num2,iteration=0;  //
		double sum=0;
		
		for(int i=1;i<=num2 ;i++) {
			int j=i;
			
			while (j > 0) {
				
				j = j/10;
				digit++;
			}

			sum=0;
			for(int num1=i;num1>0;iteration++) {
			
			dig = num1%10;
			
			num1=num1 - dig;
			
			num1 = num1/10;
			sum= sum + (Math.pow(dig, digit));
			sum = (int)sum;
			if(i == sum) {
				System.out.println(i+" is Amstrong Number !!!");
			}
			else {
				System.out.println(i+" is Not Amstrong Number !!!");
			}
			
			
//			return sum;
		}
	}
}

}
