package string_problem;

public class Count_Vowels_And_Consonants {

	public static void main(String[] args) {
		
		String str = "automation";
		int vowel=0, conso=0;
		
		for(char c : str.toCharArray()) {
			
			if("aeiouAEIOU".indexOf(c)!=-1) {
				vowel++;
			}
			else {
				conso++;
			}
		}
		System.out.println("vowel = "+vowel + "\n" + "conso = "+conso);
	}
}
