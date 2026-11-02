package programs;

//Count digits in a number
public class A_BasicProgram0015 {

	public static void main(String[] args) {
		count(); countdigit();
	}

	// Total number of digit is counted here
	static void count() {
		long a = 102938723098l;
		int digit = 0;

		while (a > 0) {
			a = a / 10;
			digit++;
		}
		System.out.println(digit);
	}
	
	//Count a number of occurance for a digit in a given number
	
	static void countdigit() {
		int a = 9336335;
		int numberOccuranceFor = 0;
		
		while(a>0) {
			int temp = a % 10;
			if(temp == 3) {
				numberOccuranceFor++;
			}
			 a = a / 10;
		}
		
		System.out.println("Total number of occurance for the digit 3 is: " +numberOccuranceFor);
	}
}
