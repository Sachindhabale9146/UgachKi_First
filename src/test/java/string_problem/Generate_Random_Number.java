package string_problem;
import java.util.Random;
public class Generate_Random_Number {

	public static void main(String[] args) {
		
		Random num = new Random();
		
		System.out.println("random number :" +num.nextInt(100));
	}
}
