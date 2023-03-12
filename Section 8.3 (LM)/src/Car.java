/*
	* Author: Anthony Orozco
	* Course: COP 2210 RVC 1231
	* Date: 3/2/2023
	* Assignment: 8.2 Lab (H)
	* Instructor: Sergio Pisano
	* Description: Driving cost
*/

public class Car {
   private int modelYear; 
   private int purchasePrice;
   private int currentValue;

   public void setModelYear(int userYear){
      modelYear = userYear;
   }

   public int getModelYear() {
      return modelYear;
   }

   public void setPurchasePrice(int purchasePrice) {
	   this.purchasePrice = purchasePrice;
   }

   public int getPurchasePrice() {
	   return purchasePrice;
   }

   public void calcCurrentValue(int currentYear) {
      double depreciationRate = 0.15;
      int carAge = currentYear - modelYear;

      currentValue = (int) 
         Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
   }

   public void printInfo() {
	   System.out.println("Car's information:");
	   System.out.println("  Model year: " + modelYear);
	   System.out.println("  Purchase price: $" + purchasePrice);
	   System.out.println("  Current value: $" + currentValue);
   }

}

/* CODE OUTPUT IN ECLIPSE: 
Car's information:
  Model year: 2011
  Purchase price: $18000
  Current value: $5770

*/
