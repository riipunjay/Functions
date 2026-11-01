package programs;

public class A_BasicProgram0002 {
	
	//This is a program to find odd even
	public static void main(String[] args) {
		oddEven();
		oddEven(0);
	}

	static void oddEven() {
		int a = 230;
		if(a % 2 == 0)
			System.out.println("Number given is Even");
		else
			System.out.println("Number given is odd");
	}
	
	static int oddEven(int a1){
		
		if(a1 % 2 == 1) 
			System.out.println("Number is odd");
		else
			System.out.println("Number is even");
		
		return a1;
	}

}
