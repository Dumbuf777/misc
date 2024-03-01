/**
 * 
 */
package miscStringProgram;
	
/**
 * @author shrikrushna.sonkar
 *
 */
public class RemoveWhiteSpaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String str1 = "Saket Saurav        is a QualityAna    list";
  
        //1. Using replaceAll() Method
  
        String str2 = str1.replaceAll("\\s", "");
  
        System.out.println(str2);

	}

}
