package miscStringProgram;

import java.util.Scanner;

public class CheckVowel {
	public static void main(String[] args) {
		//
		// Check Vowel or Consonant in Java - First Way
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Alphabet: ");

		ch = sc.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("\nIt is a Vowel.");
		} else
			System.out.println("\nIt is a Consonant.");

		char ch1;
		int count = 0;
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		System.out.print("Enter an Alphabet: ");
		ch1 = sc.next().charAt(0);

		for (int i = 0; i < 10; i++) {
			if (ch1 == vowels[i]) {
				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.println("\n" + ch1 + " is a Consonant");
		} else
			System.out.println("\n" + ch1 + " is a Vowel");
	}
}
