package miscProgram;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		
		float p, r,t,si;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Principle Amount: ");
	      p = sc.nextFloat();
	      System.out.print("Enter the Rate of Interest: ");
	      r = sc.nextFloat();
	      System.out.print("Enter the Time Period (in Year): ");
	      t = sc.nextFloat();
	      si=(p*r*t)/100;
	      System.out.println("Simple intrest :="+si);
	}

}
