package programs;

public class A_BasicProgram004 {

	public static void main(String[] args) {
		printFibonnaci();
		printFibo();
		System.out.println(printFiboSequenceSpot());
		
	}
	
	static void printFibonnaci() {
		int a = 0;
		int b = 1;
		
		for(int count = 0; count <=8; count++) {
			System.out.println(a + " ");
			
			int next = a + b;
			a = b;
			b = next;		
		}
	}
	
	static int printFibo() {
		int first = 0;
		int second = 1;
		System.out.println("Printing fibonnaci series while using return");
		for(int count = 0; count<=9; count++) {
			System.out.println(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}
		
		return first;
	}
	
	//Return the 10th Fibonnaci series
		static int printFiboSequenceSpot() {
			int first = 0;
			int second = 1;
			int next = 0;
System.out.println("=====================");
System.out.println("Printing the 8th spot of fibonnaci number");
			for(int count = 0; count<=8; count++) {

				next = first + second;
				first = second;
				second = next;
			}
			
			return first;
		}
}
