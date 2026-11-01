package programs;

public class swapNumbers {
	
	public static void main(String[] args) {
		swapNum();
		swapNum(123, 582);
		swapString();
		String res = swapreturn();
		System.out.println(res);
	}
	
	//Swaping the two numbers with help of Function
	static void swapNum() {
		int a = 23; 
		int b = 45;
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
	}
	
	//Swaping 2 numbers with help of 2 parameters
	static void swapNum(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
	}
	
	//swapping 2 string with help of function
	static void swapString() {
		String a = "Ripunjay";
		String b = "Shivam";
		String temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
	}

	//Swapping 2 int numvers using return
	//Because one operand is a String, Java performs concatenation. else if you have used int as method type, it would result in error
	static String swapreturn() {
		int a = 12;
		int b = 29;
		int temp = a;
		a = b;
		b = temp;
		
		return a + " " + b;
	}
}
