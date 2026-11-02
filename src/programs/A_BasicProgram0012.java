package programs;

public class A_BasicProgram0012 {

	//Calculate sum of first N natural numbers
	
	public static void main(String[] args) {
		sumOfN();sumofNWhile(); sumofNdoWhile(11);
	}
	
	static void sumOfN() {
		int n = 11;
		int sum = 0;
		
		for(int i = 0; i<=n; i++) {
			sum = sum + i;	
		}
		System.out.println(sum);
	}
	
	static void sumofNWhile() {
		int sum = 0;
		int i = 0;
		while(i<=13) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}
	
	static int sumofNdoWhile(int num) {
		int sum = 0;
		int i = 0;
		do {
			sum = sum + i;
			i++;
			
		}while(i<=num);
		System.out.println(sum);
		return sum;
		
	}
}
