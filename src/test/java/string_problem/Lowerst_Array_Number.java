package string_problem;

public class Lowerst_Array_Number {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,5,6,8,0};
		
		int lowest = a[0];
		
		for(int i : a) {
			
			if(i<lowest) {
				
				lowest = i;
			}
		}
		System.out.println("lowest number in array : " +lowest);
	}
}
