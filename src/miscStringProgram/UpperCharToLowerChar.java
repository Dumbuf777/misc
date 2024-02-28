package miscStringProgram;

import java.util.Scanner;

public class UpperCharToLowerChar {

	public static void main(String[] args) {
		 char chUpper, chLower;
	      int ascii;
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter a Character in Uppercase: ");
	      chUpper = sc.next().charAt(0);
	      
	      ascii = chUpper;
	      ascii = ascii + 32;
	      chLower = (char)ascii;
	      
	      System.out.println("\nEquivalent Character in Lowercase = " +chLower);

	}

}
