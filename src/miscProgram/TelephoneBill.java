package miscProgram;

import java.util.Scanner;

public class TelephoneBill {

	public static void main(String[] args) {
		
		/*This article contains a program in Java that can calculate and print the monthly telephone call bill.
		    The bill must be generated as per following criteria
			The charge of first 60 minutes of calls is $14
			And after first 60 minutes of calls, the customer will get charged $.12 for each extra minutes
			If the customer made less than 60 minutes of call, then also he/she has to pay $14, even if he/she made no calls for that month.	
		*/
		
		int numberOfCalls;
		float  phoneBill;
		Scanner sc= new Scanner(System.in);
	    System.out.print("Enter the Total Minutes of Calls Made this Month: ");
	    numberOfCalls=sc.nextInt();  
	    

	      if(numberOfCalls<=60)
	         phoneBill = 14;
	      else
	      {
	         numberOfCalls = numberOfCalls - 60;
	         phoneBill = 14 + (float)(numberOfCalls * 0.12);
	      }
	      System.out.println("\nTelephone Bill this Month = " +phoneBill);


	}

}
