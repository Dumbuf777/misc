package miscStringProgram;

public class PermutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringPermutation("JSP");

	}

	static public void StringPermutation(String input) {
		StringPermutation("", input);
	}

	private static void StringPermutation(String permutation, String input) {
		if (input.length() == 0) {
			System.out.println(permutation);
		} else {
			for (int i = 0; i < input.length(); i++) {
				StringPermutation(permutation + input.charAt(i),input.substring(0, i) + input.substring(i + 1, input.length()));
			}
		}
	}

}
