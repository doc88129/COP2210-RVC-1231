/*
	* Author: Anthony Orozco
	* Course: COP 2210 RVC 1231
	* Date: 1/15/2023
	* Assignment: 3.1 Lab (H)
	* Instructor: Sergio Pisano
	* Description: Expression for calories burned during workout
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
	   Scanner scnr = new Scanner(System.in);
	   int age = scnr.nextInt();
	   int weight = scnr.nextInt();
	   int heartRate = scnr.nextInt();
	   int time = scnr.nextInt();
	   
	   double calories = ((age * 0.2757) + (weight * 0.03295) + (heartRate * 1.0781) - 75.4991 ) * time / 8.368;
	   
	   System.out.printf("Calories: %.2f calories\n", calories);
	   
   }
} 

/* CODE OUTPUT IN ECLIPSE: 
Calories: 736.21 calories

*/
