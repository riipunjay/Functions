package programs;
//This program is for multiplication table
public class A_BasicProgram0011 {

	public static void main(String[] args) {
		table7(); table10();table3();
	}
	
	static void table7() {
		int table = 7;
		for(int i = 1; i<=10; i++)
			System.out.println(table *  i);
	}
	
	static void table10() {
		int table = 10;
		int i = 1;
		while(i<=10) {
			System.out.println(table * i);
			i++;
		}
	}
	
	static void table3() {
		int table = 3;
		System.out.println("================Table of 3 ===================");
		int i = 1;
		do {
			System.out.print(table * i + " ");	
			i++;
		}while(i<=10);
	}
}
