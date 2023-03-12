/*
	* Author: Anthony Orozco
	* Course: COP 2210 RVC 1231
	* Date: 1/15/2023
	* Assignment: 2.2 Lab (LM)
	* Instructor: Sergio Pisano
	* Description: House real estate summary
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int currentPrice; 
      int lastMonthsPrice;
      int priceChange;
      double mortgage;

      currentPrice = scnr.nextInt(); 
      lastMonthsPrice = scnr.nextInt();
      priceChange = currentPrice - lastMonthsPrice;
      mortgage = (currentPrice * 0.051) / 12;
    		  
      System.out.printf("This house is $%d. The change is $%d since last month.\n", currentPrice, priceChange);
      System.out.printf("The estimated monthly mortgage is $%.1f.\n", mortgage);
      
   }
}

/* CODE OUTPUT IN ECLIPSE: 
This house is $200000. The change is $-10000 since last month.
The estimated monthly mortgage is $850.0.

*/
