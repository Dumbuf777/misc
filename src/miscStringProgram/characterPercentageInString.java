package miscStringProgram;

import java.text.DecimalFormat;

/**
 * @author shrikrushna.sonkar
 *
 */
public class characterPercentageInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		characterPercentage("Tiger Runs @ The Speed Of 100 km/hour.");
         
        characterPercentage("My e-mail : eMail_Address321@anymail.com");
         
        characterPercentage("AUS : 123/3, 21.2 Overs");
		

	}
	
	public static void characterPercentage(String str) {
		int inuputstr= str.length();
		int lowercase=0;
		int uppercase=0;
		int number = 0;
		int special=0;
		for (int i=0;i<=inuputstr;i++)
		{
			char ch= str.charAt(i);
			if(Character.isUpperCase(ch)) {
				uppercase++;
			}else if(Character.isLowerCase(ch)) {
				lowercase++;
			}else if(Character.isDigit(ch)) {
				number++;
			}else {
				special++;
			}
				
		}
		  //Calculating percentage of uppercase letters, lowercase letters, digits and other characters
         
        double upperCaseLetterPercentage = (uppercase * 100.0) / inuputstr ;
         
        double lowerCaseLetterPercentage = (lowercase * 100.0) / inuputstr;
         
        double digitsPercentage = (number * 100.0) / inuputstr;
         
        double otherCharPercentage = (special * 100.0) / inuputstr;
         
        DecimalFormat formatter = new DecimalFormat("##.##");
         
        //Printing percentage of uppercase letters, lowercase letters, digits and other characters
         
        System.out.println("In '"+str+"' : ");
         
        System.out.println("Uppercase letters are "+formatter.format(upperCaseLetterPercentage)+"% ");
         
        System.out.println("Lowercase letters are "+formatter.format(lowerCaseLetterPercentage)+"%");
         
        System.out.println("Digits Are "+formatter.format(digitsPercentage)+"%");
         
        System.out.println("Other Characters Are "+formatter.format(otherCharPercentage)+"%");
         
        System.out.println("-----------------------------");
    }
	

}
