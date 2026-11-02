package programs;

public class A_BasicProgram0005 {

	public static void main(String[] args) {
		leapyear();
		leapyear(1929);
	}
	
	static void leapyear() {
		int year = 1900;
		
		if((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0) {
			System.out.println("Year is a leap year");
		}else
			System.out.println("Year is not a leap year");
	}
	
	static int leapyear(int a) {
		
		if((a % 4 == 0 && a % 100 !=0) || a % 400 == 0)
			System.out.println("Given year: " + a + " is leap year");
		else
			System.out.println("Given year: " + a + " is not a leap year");
		
		return a;
	}
}
