package programs;

public class A_BasicProgram0017 {
	
	//This program takes a number and get the sum of it.
	public static void main(String[] args) {
	addsum();
	
	}
	
	static void addsum() {
		int a = 928374;
		int sum = 0;
		
		while(a>0) {
			int temp = a % 10;//4 7
			sum = sum + temp; //4 11
			a = a / 10; // 92837
			
			
		}
		
		System.out.println(sum);
	}

}
