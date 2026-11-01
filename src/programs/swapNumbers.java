package programs;

public class swapNumbers {
	
	public static void main(String[] args) {
		swapNum();
	}
	
	static void swapNum() {
		int a = 23; 
		int b = 45;
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
	}

}
