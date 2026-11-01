package programs;

//This program is about finding largest among three numbers using if else statement
public class A_BasicProgram0003 {

	public static void main(String[] args) {
		largestamong3();
		largest(12314, 2467, 563);
	}

	static void largestamong3() {
		int a = 2134;
		int b = 2388;
		int c = 298;

		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		System.out.println(max);
	}

	static int largest(int a, int b, int c) {
		int max = a;
		if(b>max)
			max = b;
		if(c>max)
			max = c;;
		System.out.println(max);
		return max;
	}
}
