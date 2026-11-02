package programs;

public class A_BasicProgram0008 {
	
	//this program is about finding which number is positive, negative or zero
	public static void main(String[] args) {
		checkNum();
		checknum(124);
	}	
	static void checkNum() {
		int num = 8;
		if(num > 0)
			System.out.println("Number is positive");
		else if(num<0)
			System.out.println("Number is negative");
		else
			System.out.println("Number is Zero");
	}
	
	
	static int checknum(int a) {
		if(a > 0)
			System.out.println("This Number " + a+ " is Positive");
		else if(a<0)
			System.out.println("This Number " + a+ " is Negative");
		else
			System.out.println("This Number " + a+ " is Zero");
		
		return a;
	}

}
