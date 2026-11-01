package programs;

public class A_BasicProgram0002 {
	
	//This is a program to find odd even
	public static void main(String[] args) {
		oddEven();
	}

	static void oddEven() {
		int a = 230;
		if(a % 2 == 0)
			System.out.println("Number given is Even");
		else
			System.out.println("Number given is odd");
	}
}
