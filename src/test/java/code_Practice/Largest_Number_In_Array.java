package code_Practice;

public class Largest_Number_In_Array {

	public static void main(String[] args) {
		
		int[] n = {4,2,5,66,44,98,322};
		int larger = n[0];
		for(int c : n) {
			
			if(c>larger) {
				larger = c;
			}
		}
		System.out.println("Largest Number in Array : "+larger);
	}
}
