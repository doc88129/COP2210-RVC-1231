/*
	* Author: Anthony Orozco
	* Course: COP 2210 RVC 1231
	* Date: 2/6/2023
	* Assignment: 5.1 Lab (LM)
	* Instructor: Sergio Pisano
	* Description: Speeding ticket
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
	   Scanner scnr = new Scanner(System.in);
	   int speedLimit = scnr.nextInt();
	   int vehicleSpeed = scnr.nextInt();
	   
	   if (vehicleSpeed > speedLimit + 40) {
		   System.out.println(300);
	   } else if (vehicleSpeed > speedLimit + 20) {
		   System.out.println(150);
	   } else if (vehicleSpeed > speedLimit + 5) {
		   System.out.println(75);
	   } else if (vehicleSpeed <= speedLimit - 10) {
		   System.out.println(50);
	   } else {
		   System.out.println(0);
	   }
   }
}

/* CODE OUTPUT IN ECLIPSE: 
50

*/
