package miscStringProgram;

public class StringContainsVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringContainsVowels("Hello")); // true
		System.out.println(stringContainsVowels("TV")); // false

		System.out.println("____________________________");
		String str = new String("Hi Welcome to my world!");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u')

				System.out.println("Given string contains " + str.charAt(i) + " at the index " + i);
		}
	}

	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}

}
