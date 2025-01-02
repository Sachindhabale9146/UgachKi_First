package automation;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Reverse_Array_Elements {

//	@Test
	public static void main(String args[]) {
		
		int[] A = {3,2,5,7,5,8,1,8};
		int n = A.length;
		System.out.println("length of A : "+n);
		int[] R = new int[n];
		
		
		int index=0;
		for(int i = n-1;i>=0;i--) {
			R[index]=A[i];
			index++;
//			System.out.println("R value : "+R);
		}
		System.out.println("Reverse Array"+Arrays.toString(R));
	}
}
