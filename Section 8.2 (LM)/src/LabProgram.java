/*
	* Author: Anthony Orozco
	* Course: COP 2210 RVC 1231
	* Date: 3/2/2023
	* Assignment: 8.2 Lab (H)
	* Instructor: Sergio Pisano
	* Description: Driving cost
*/

import java.util.Scanner;

public class LabProgram {

	public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven) {
		return dollarsPerGallon * (milesDriven / milesPerGallon);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double milesPerGallon = scan.nextDouble();
		double dollarsPerGallon = scan.nextDouble();
		
		System.out.printf("%.2f ", drivingCost(milesPerGallon, dollarsPerGallon, 10.0));
		System.out.printf("%.2f ", drivingCost(milesPerGallon, dollarsPerGallon, 50.0));
		System.out.printf("%.2f\n", drivingCost(milesPerGallon, dollarsPerGallon, 400.0));
		   
	}
}

/* CODE OUTPUT IN ECLIPSE: 
1.58 7.90 63.20

*/
