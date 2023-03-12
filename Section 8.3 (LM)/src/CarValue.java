/*
	* Author: Anthony Orozco
	* Course: COP 2210 RVC 1231
	* Date: 3/2/2023
	* Assignment: 8.2 Lab (H)
	* Instructor: Sergio Pisano
	* Description: Driving cost
*/

// TODO: Add import statements
import java.util.Scanner;

public class CarValue {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Car myCar = new Car();

      int userYear = scnr.nextInt();
      int userPrice = scnr.nextInt();
      int userCurrentYear = scnr.nextInt();

      myCar.setModelYear(userYear);
      myCar.setPurchasePrice(userPrice);
      myCar.calcCurrentValue(userCurrentYear);

      myCar.printInfo();
   }
}

/* CODE OUTPUT IN ECLIPSE: 
Car's information:
  Model year: 2011
  Purchase price: $18000
  Current value: $5770

*/
