/*
	* Author: Anthony Orozco
	* Course: COP 2210 RVC 1231
	* Date: 3/2/2023
	* Assignment: 8.1 Lab (H)
	* Instructor: Sergio Pisano
	* Description: Nutritional information
*/

public class FoodItem {
   private String name;
   private double fat;
   private double carbs;
   private double protein;

   public FoodItem() {
	   name = "Water";
	   fat = 0.0;
	   carbs = 0.0;
	   protein = 0.0;
   }
   
   public FoodItem(String name, double fat, double carbs, double protein) {
	   this.name = name;
	   this.fat = fat;
	   this.carbs = carbs;
	   this.protein = protein;
   }
   
   public String getName() {
      return name;
   }

   public double getFat() {
      return fat;
   }

   public double getCarbs() {
      return carbs;
   }

   public double getProtein() {
      return protein;
   }

   public double getCalories(double numServings) {
      double calories = ((fat * 9) + (carbs * 4) + (protein * 4)) * numServings;
      return calories;
   }

   public void printInfo() {
      System.out.println("Nutritional information per serving of " + name + ":");
      System.out.printf("  Fat: %.2f g\n", fat);
      System.out.printf("  Carbohydrates: %.2f g\n", carbs);
      System.out.printf("  Protein: %.2f g\n", protein);
   }
}

/* CODE OUTPUT IN ECLIPSE: 
Nutritional information per serving of M&M's:
  Fat: 10.00 g
  Carbohydrates: 34.00 g
  Protein: 2.00 g
Number of calories for 1.00 serving(s): 234.00
Number of calories for 3.00 serving(s): 702.00

*/
