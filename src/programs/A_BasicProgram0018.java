package programs;

public class A_BasicProgram0018 {
//This program is about finding the Armstrong number
	
	public static void main(String[] args) {
		findArmstrong();
	}
	
	static void findArmstrong() {
		int num = 153;
		int original = num;
		int cube = 0;
		int store = 0;
		while(num >0) {
			
			int temp = num % 10;
			 cube = temp * temp * temp; //27
			 store = store + cube; //27
			 num = num /10;
			 
		}
		
		if(original == store)
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is not armstrong");
	}
}
