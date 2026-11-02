package programs;

public class A_BasicProgram0006 {
	
	//This is about finding simple interest

	public static void main(String[] args) {
		findsi();
	}
	
	static void findsi() {
		int principle = 10000;
		float rate = 2.58f;
		int time = 2;
		
		float simpleInterest = principle * rate * time/100;
		System.out.println(simpleInterest);
	}
}
