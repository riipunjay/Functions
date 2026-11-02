package programs;

public class A_BasicProgram0010 {

	// This program helps find out how many even or edd numbers are between two
	// numbers
	public static void main(String[] args) {
		countEven();
		countOdd();
	}

	// Count the numbers which is even from 1 t0 100
	static void countEven() {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				count++;
		}
		System.out.println(count);
	}

	// count the numbers which is odd from 1 to 153

	static void countOdd() {
		int count = 0;
		int i = 1;
		while (i <= 153) {
			if (i % 2 == 1)
				count++;

			i++;
		}
		System.out.println(count);
	}
}
