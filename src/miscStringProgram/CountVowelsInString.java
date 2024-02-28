package miscStringProgram;

public class CountVowelsInString {

	public static void main(String[] args) {
		
		String S= "hjvayva fbasbduf";
        int count = 0;
        for(int i=0;i<=S.length()-1;i++) {
        	 // check if char[i] is vowel
            if (S.charAt(i) == 'a' || S.charAt(i) == 'e'
                || S.charAt(i) == 'i'
                || S.charAt(i) == 'o'
                || S.charAt(i) == 'u') {
                // count increments if there is vowel in
                // char[i]
                count++;
        }
		

	}
        // display total count of vowels in string
        System.out.println("Total no of vowels in string are: " + count);
	}
}