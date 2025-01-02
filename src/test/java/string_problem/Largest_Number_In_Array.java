package string_problem;

public class Largest_Number_In_Array {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,9};
		
		int largest = a[0];
		for(int i : a){
			
			if(i>largest) {
				
				largest = i;
			}
		}
		System.out.println("the largest number : " +largest);
	}
}
