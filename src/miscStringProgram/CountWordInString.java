package miscStringProgram;

public class CountWordInString {

	public static void main(String[] args) {
		String s1="welcome aboard in gameium llp";
	        String[] s2 = s1.split(" ");
	        int count=1;
	        System.out.println(s2.length);
		for (int i=0;i<s1.length()-1;i++) {
			
			if((s1.charAt(i)==' ')&&(s1.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println(count);	

	
	//Count Number of Words in a String
	String words = "One Two Three Four";
	int countWords = words.split("\\s").length;
	System.out.println(countWords);
	}
}
	
