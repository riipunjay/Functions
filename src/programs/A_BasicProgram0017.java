package programs;

public class A_BasicProgram0017 {
	
	//This program takes a number and get the sum of it.
	public static void main(String[] args) {
	addsum(); sumdigit(8293765);
	
	}
	
	static void addsum() {
		int a = 928374;
		int sum = 0;	
		while(a>0) {
			int temp = a % 10;
			sum = sum + temp; 
			a = a / 10; 			
		}
		
		System.out.println(sum);
	}
	
	static int sumdigit(int a) {
		
		int sum = 0;
		
		while(a>0) {
			int temp = a % 10;
			sum = sum + temp;
			a = a / 10;
		}
		
		System.out.println(sum);
		return sum;
	}

}
