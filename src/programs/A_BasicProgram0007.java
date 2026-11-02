package programs;
//This program is to find out the conversion of celsius to fahrenheit
public class A_BasicProgram0007 {

	public static void main(String[] args) {
		convertCtoF();
		convertCtoF1(0, 0);
		conctoF(32);
		
	}
	
	
	static void convertCtoF() {
		float celsius = 36;
		float fahrenheit = (celsius * 9/5) + 32;
		System.out.println(fahrenheit);
	}
	
	//This is a example of overwriting since the main method values are just useless, here we dont need to have 2 parameters
	static float convertCtoF1(float celsius, float fahrenheit) {
		
		celsius = 36;
		fahrenheit = (celsius * 9/5) + 32;
		System.out.println(fahrenheit);
		return fahrenheit;
		
	}
	
	//Using only one parameter, lets convert the temp
	
	static float conctoF(float celsius) {
		float fahrenheit = (celsius * 9/5) + 32;
		System.out.println(fahrenheit);
		return fahrenheit;
	}
}
