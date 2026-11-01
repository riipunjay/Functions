package programs;

public class A_BasicProgram0001 {

	public static void main(String[] args) {
		String valueshown = introduction("Ripunjay", "blr", "What about you?");
		System.out.println(valueshown);
	}
	
	static String introduction(String name, String place, String greet) {
		
		String greeting = "Hello " + name + ", I am from " + place + ". I am from Mechanical bg, " + greet;
		return greeting;
		
	}

}

