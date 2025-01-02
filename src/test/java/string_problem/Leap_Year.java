package string_problem;

public class Leap_Year {

	public static void main(String[] args) {
		
		int year = 2000, count=0;
	 while(year<3000) {	
		boolean isleap = (year%4==0 && year%100!=0) ||( year%400==0);
		if(isleap==true) {
			System.out.println(year + " is a leap year");
			count++;
		}
		else {
//			System.out.println(year+" is not leap year");
		}
		year++;
	 }
	 
	 System.out.println("total leap year : "+count);
	}
}
