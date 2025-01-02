package automation;

import java.util.Arrays;

public class Remove_Duplicate_Elements_Arrays {

	public static void main(String[] args) {
		
		int[] FA = {2,4,6,7,8,4,6};
		
		int LFA = FA.length;
		
		
		int count=0, dup=0;
		for(int i=0;i<LFA;i++) {
			for(int j=i+1;j<LFA;j++) {
				
//				System.out.println("a="+a+"  "+"b="+b);
				if(FA[i]==FA[j]) {
					dup++;
//					System.out.println("duplicate value  : "+a);									
				}

			}
		}
//		System.out.println("after removed duplicates ele : "+Arrays.toString(SA));
		int[] SA = new int[LFA-dup];
		
		for(int i=0;i<LFA-dup;i++) {
			for(int j=i+1;j<LFA-dup;j++) {
				
				int a = FA[i];
//				int b = FA[j];
//				System.out.println("a="+a+"  "+"b="+b);
				if(a!=0) {
					SA[count] = FA[i];									
				}

			}
			count++;
		}
		
		System.out.println("after removed duplicates ele : "+Arrays.toString(SA));
	}
}
