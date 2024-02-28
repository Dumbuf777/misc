package miscProgram;

import java.util.Scanner;

public class DiscountandPriceToPaid {
	/*
	 * Shopping Amount   : Discount 
	 *  <=800            : No discount
	 *  >800 and <=1500  : 10%
	 *  >1500 and <=2500 : 15% 
	 *  >2500 and <=5000 : 20% 
	 *  >5000            : 30%
	 */
	public static void main(String[] args)
	{
		float totalCost=0;
		float costToPaid=0;
		float discount=0;
		Scanner sc = new Scanner(System.in);
		totalCost=sc.nextFloat();
		if(totalCost<=800) {
			costToPaid=totalCost;
		}else if(totalCost>800 && totalCost<=1500)  {
			discount=(totalCost*10)/100;
			costToPaid=totalCost-discount;
		}else if(totalCost>1500 && totalCost<=2500)  {
			discount=(totalCost*15)/100;
			costToPaid=totalCost-discount;
		}else if(totalCost>2500 && totalCost<=5000)  {
			discount=(totalCost*20)/100;
			costToPaid=totalCost-discount;
		}else {
			discount=(totalCost*30)/100;
			costToPaid=totalCost-discount;
		}
		
		System.out.println(costToPaid);

	}

}
