/*
	* Author: Anthony Orozco
	* Course: COP 2210 RVC 1231
	* Date: 2/6/2023
	* Assignment: 5.2 Lab (LM)
	* Instructor: Sergio Pisano
	* Description: Interstate highway numbers
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
	   Scanner scnr = new Scanner(System.in); 
	   int highwayNumber = scnr.nextInt();
	   
	   if (highwayNumber < 100 && highwayNumber > 0) {
		   String direction = "";
		   if (highwayNumber % 2 == 0) {
			   direction = "east/west";
		   } else {
			   direction = "north/south";
		   }
		   System.out.println(String.format("I-%d is primary, going %s.", highwayNumber, direction));
	   } else if (highwayNumber > 100 && highwayNumber < 1000 && highwayNumber % 100 != 0) {
		   int primaryHighway = highwayNumber % 100;
		   String direction = "";
		   if (primaryHighway % 2 == 0) {
			   direction = "east/west";
		   } else {
			   direction = "north/south";
		   }
		   System.out.println(String.format("I-%d is auxiliary, serving I-%d, going %s.", highwayNumber, primaryHighway, direction));
	   } else {
		   System.out.println(String.format("%d is not a valid interstate highway number.", highwayNumber));
	   }
	   
   }
}

/* CODE OUTPUT IN ECLIPSE: 
I-90 is primary, going east/west.

*/
