/*
	* Author: Anthony Orozco
	* Course: COP 2210 RVC 1231
	* Date: 3/2/2023
	* Assignment: 8.1 Lab (H)
	* Instructor: Sergio Pisano
	* Description: Nutritional information
*/

import java.util.Scanner;

public class NutritionalInfo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      FoodItem foodItem;

      String itemName = scnr.next();
      if(itemName.equals("Water") || itemName.equals("water")) {
         foodItem = new FoodItem();

         foodItem.printInfo();
         System.out.printf("Number of calories for %.2f serving(s): %.2f\n", 1.0, 
                          foodItem.getCalories(1.0));
      }

      else {
         double amountFat = scnr.nextDouble();
         double amountCarbs = scnr.nextDouble();
         double amountProtein = scnr.nextDouble();

         foodItem = new FoodItem(itemName, amountFat, amountCarbs, amountProtein);

         double numServings = scnr.nextDouble();

         foodItem.printInfo();
         System.out.printf("Number of calories for %.2f serving(s): %.2f\n", 1.0,
                             foodItem.getCalories(1.0));

         System.out.printf("Number of calories for %.2f serving(s): %.2f\n", numServings,
                             foodItem.getCalories(numServings));
      }
   }
}
