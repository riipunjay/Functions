package programs;

import java.util.Scanner;

//This program helps you find the grade of results
public class A_BasicProgram0009 {

	public static void main(String[] args) {
	findGrade();	
	}
	
	static void findGrade() {
		int marks = 100;
		if(marks >=90 & marks<=100) 
			System.out.println("Grade A");
		else if(marks>=80 && marks<=89)
			System.out.println("Grade B");
		else if(marks>=70 && marks<=79)
			System.out.println("Grade C");
		else if(marks>=60 && marks<=69)
			System.out.println("Grade D");
		else
			System.out.println("Fail");
	}
}
