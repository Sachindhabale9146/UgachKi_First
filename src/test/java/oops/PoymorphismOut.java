package oops;

public class PoymorphismOut extends Polymorphism {

	public static void main(String[] args) {
		
		PoymorphismOut obj = new PoymorphismOut();
		
		obj.setSallary(40000);
		obj.setName("Sachin");
		
		int a = obj.getSallary();
		String b = obj.getName();
		System.out.println("sallary : "+a+"\n"+"name : "+b);
	}
}
