/**
 * 
 */
package miscProgram;

import java.util.Arrays;

/**
 * @author shrikrushna.sonkar
 *
 */
public class SecondLargestNumberArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] a={1,9,2,8,7,6,3,4,5,1};  
		int[] b={44,66,99,77,33,22,55};  
		//System.out.println("Second Largest: "+getSecondLargestNum(a,10));  
		System.out.println("Second Largest: "+getSecondLargestNum(b,7));  
		System.out.println("Second Largest: "+getSecondLargest(b,7));  

	}
	
	public static int getSecondLargestNum(int[] a, int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				System.out.println(a[i]);
				System.out.println(a[j]);
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					System.out.println(a[j]);
					System.out.println(temp);
				}
			}
		
		}
		return a[total-1];
		
	}
	
	public static int getSecondLargest(int[] a, int total){  
		Arrays.sort(a);  
		return a[1];  
		}  

}
