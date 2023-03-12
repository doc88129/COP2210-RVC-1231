/*
	* Author: Anthony Orozco
	* Course: COP 2210 RVC 1231
	* Date: 1/15/2023
	* Assignment: 2.3 Lab (LM)
	* Instructor: Sergio Pisano
	* Description: Divide input integers 3 times
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
	   Scanner scnr = new Scanner(System.in);
	   int userNum = scnr.nextInt();
	   int divNum = scnr.nextInt();
	   final int DIVID_TIMES = 3;
	   
	   for (int i = 0; i < DIVID_TIMES; i++) {
		   userNum /= divNum;
		   System.out.print(userNum + (i < (DIVID_TIMES - 1) ? " " : "\n"));
	   }
   }
}

/* CODE OUTPUT IN ECLIPSE: 
1000 500 250

*/
