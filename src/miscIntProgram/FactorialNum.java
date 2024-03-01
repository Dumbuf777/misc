package miscIntProgram;

public class FactorialNum {
	// F(n) = F(1)*F(2)...F(n-1)*F(n)

	public static void main(String[] args) {
		int i, fact = 1;
		int number = 4;// It is the number to calculate factorial
		fact = (int) factorial(number);
		System.out.println("Factorial of " + number + " is: " + fact);
		System.out.println("--------------------------");
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}

	public static long factorial(long n) {
		if (n == 1)
			return 1;
		else
			return (n * factorial(n - 1));
	}

}
