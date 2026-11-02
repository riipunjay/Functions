package programs;
//Find the prime numbers
public class A_BasicProgram0016 {

	public static void main(String[] args) {
	findPrime(); findPrime(98);	
	}
	
	static void findPrime() {
		int number = 20;
		
		boolean isPrime = true;
		
		if(number <= 1)
			isPrime = false;
		else
			for(int i = 2; i<=number/2; i++) {
				if(number % i == 0)
					isPrime = false;
				break;
			}
		
		if(isPrime) {
			System.out.println(number + " is a prime number");
		}else
			System.out.println(number + " is not a prime number");
	}
	
	static boolean findPrime(int num) {
		
		boolean isPrime = true;
		
		if(num <= 1)
			isPrime = false;
		
		for(int i = 2; i<num/2; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime)
			System.out.println("Number is a Prime");
		else
			System.out.println("Number is not prime");
		
		return isPrime;
	}
}
