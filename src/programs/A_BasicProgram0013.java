package programs;
//This program is for the Factorial
public class A_BasicProgram0013 {

	public static void main(String[] args) {
	factorial();	
	System.out.println("Factorial for the number is: "+ factorial(7));
	factorialdoWhile();
	}
	//using for loop
	static void factorial() {
		int num = 5;
		int result = 1;
		for(int i = 2; i<=num; i++) {
			result = result * i;
		}
		System.out.println("Factorial of the number " + num+ " is ==> "+result);
	}
	
	//using while loop, with a parameter
	static int factorial (int num) {
		int result = 1;
		int i = 2;
		while(i<=num) {
			result = result * i;
			i++;
		}
		return result;
	}
	
	//Using do while loop, without parameter
	static void factorialdoWhile() {
		int result = 1;
		int num = 9;
		int i = 2;
		do {
			result = result * i;
			i++;
			
		}while(i<=9);
		
		System.out.println(result);
	}
}
