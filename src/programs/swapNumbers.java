package programs;

public class swapNumbers {
	
	public static void main(String[] args) {
		swapNum();
		swapNum(123, 582);
	}
	
	static void swapNum() {
		int a = 23; 
		int b = 45;
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
	}
	
	static void swapNum(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
	}

}
