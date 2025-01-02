package string_problem;

public class Working_On_String {

	public static void main(String[] args) {
		
		String str = "this is a string program.";
		
		String str2 = str.concat(str+" na ji nana");
		
		System.out.println("output"+str2);
		str= str.replaceAll(" ", "");
		System.out.println(str);
	}
}
