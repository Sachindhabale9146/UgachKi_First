package string_problem;

public class Perfect_Number {

	public static void main(String[] args) {
				
		for(int i=2;i<=500;i++) {
			int c = i,b=0;
			
			for(int j=1;i>j;j++) {
				
				if(c%j==0) {
										
					b+=j;
				}
			}
			 
			if(i==b) {
				System.out.println(i + " = is number perfect number");
			}
			
		}
	}
}
