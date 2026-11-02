package programs;

//Reversing the number
public class A_BasicProgram0014 {

	public static void main(String[] args) {
		revNumber(); revnumber(287310);
	}

	static void revNumber() {
		int num = 28376;
		int rev = 0;
		while (num > 0) {
			int temp = num % 10;
			rev = rev * 10 + temp;
			num = num / 10;
		}
		System.out.println("Reverse of the given number is: " + rev);
	}
	//This is same thing, but using return statement!!
	static int revnumber(int num) {
		int rev = 0;
		while(num>0) {
			int temp = num % 10;
			rev = rev * 10 + temp;
			num = num / 10;
		}
		System.out.println(rev);
		return rev;
	}
}
