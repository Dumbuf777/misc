package miscStringProgram;

public class ReverseString {

	public static void main(String[] args) {
		
		String str= "hvafVLD";
		String rev="";
		for(int i=0;i<str.length();i++) {
			char char1 = str.charAt(i);
			rev = char1+rev;
		}
		
		
		System.out.println("Reversed word: "+ rev);
		
		System.out.println("___________________________________________________________________");
		  String input = "GeeksforGeeks";
 
        // getBytes() method to convert string
        // into bytes[].
        byte[] strAsByteArray = input.getBytes();
 
        byte[] result = new byte[strAsByteArray.length];
 
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
 
        System.out.println(new String(result));
	}
	
}
