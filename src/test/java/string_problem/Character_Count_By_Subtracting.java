package string_problem;

public class Character_Count_By_Subtracting {

	public static void main(String[] args) {
		
		String str1 = "madam";
		int i = str1.length();
		int a=3;
		while(a>0) 
		{
			String str2 = "";
			char ch = str1.charAt(0);
			str2 = str2 + ch;
			str1 = str1.replace(str2, "");
			
			int j = str1.length();
			i = i-j;
			System.out.println(ch+" = "+i);
			a--;
		}
		
	}
}
