package string_problem;

public class Count_Of_Charectors {

	public static void main(String args[]) {
		
		String str1 = "automation";
		
		int Lstr = str1.length();
		int Lstr2 =Lstr;
		int count =1;
		for(int i=0;i<=Lstr-1;i++) {
			char ch = str1.charAt(i);
			String str2 = "";
//			System.out.println("print ch : "+ch);
			char du = 0;
			count =1;
			str2 = str2 +ch;
			String str3 = str1.replace(str2, "");
			Lstr2 = str3.length();
			for(int j=i+1;j<=Lstr2-1;j++) {
				
				du = str1.charAt(j);
//				System.out.println("print du :"+du);
				if(ch == du) {
					count++;
				}
				
			}
			
			
			System.out.print(""+ch+" = "+count+" , ");
		}
	}
	
}
