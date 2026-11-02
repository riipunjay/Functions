package programs;

public class A_BasicProgram0006 {
	
	//This is about finding simple interest

	public static void main(String[] args) {
		findsi();
		findsi(10000, 11, 3);
	}
	
	static void findsi() {
		int principle = 10000;
		float rate = 2.58f;
		int time = 2;
		
		float simpleInterest = principle * rate * time/100;
		System.out.println(simpleInterest);
	}
	
	static float findsi(float p , float r, float t) {
		
		float si = p * r * t / 100;
		System.out.println("SI is : " + si);
		return si;
	}
}
