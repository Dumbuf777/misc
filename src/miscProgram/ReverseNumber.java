package miscProgram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		//Reverse a Number in Java using while Loop
		int num, rem, rev=0;
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("Number is : "+num);
		while(num!=0) {
			rem=num%10;
			System.out.println(rem);
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println("Reverse num :"+rev);
		System.out.println("----------------------------");
		
		//Reverse a Number in Java using for Loop

		
		
	}

}

