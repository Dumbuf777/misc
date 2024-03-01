package miscStringProgram;

import java.util.HashMap;

public class CharCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		charcount("hdvhdf   jdfj");

	}
	
	public static void charcount(String str) {
		HashMap< Character, Integer> charcountmap = new HashMap<Character,Integer>();
		char [] charArray=str.toCharArray();
		for(char c:charArray) {
			if(charcountmap.containsKey(c)) {
				charcountmap.put(c, charcountmap.get(c)+1);
				
			}else {
				charcountmap.put(c, 1);
			}
		}
		  System.out.println(str+" : "+charcountmap);
	}

}
