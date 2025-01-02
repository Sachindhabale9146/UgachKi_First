package code_Practice;

public class Smallest_Number_In_String {

	public static void main(String[] args) {
		
		int[] n = {10,2,24,43,1,44,-2};
		int smallest=n[0];
		for(int a : n) {
			
			if(a<smallest) {
				smallest =a;
			}
		}
		System.out.println("Smallest number in Array : "+smallest);
	}
}
