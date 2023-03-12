/*
	* Author: Anthony Orozco
	* Course: COP 2210 RVC 1231
	* Date: 3/2/2023
	* Assignment: 9.1 Lab (H)
	* Instructor: Sergio Pisano
	* Description: Program: Online shopping cart
*/

import java.util.Scanner;

public class ShoppingCartPrinter {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      String name;
      int price;
      int quantity;
      
      System.out.println("Item 1");
      
      System.out.println("Enter the item name:");
      name = scan.nextLine();
      System.out.println("Enter the item price:");
      price = scan.nextInt();
      System.out.println("Enter the item quantity:");
      quantity = scan.nextInt();
      
      ItemToPurchase item1 = new ItemToPurchase();
      item1.setName(name);
      item1.setPrice(price);
      item1.setQuantity(quantity);
      
      System.out.println();
      scan.nextLine();
      System.out.println("Item 2");
      
      System.out.println("Enter the item name:");
      name = scan.nextLine();
      System.out.println("Enter the item price:");
      price = scan.nextInt();
      System.out.println("Enter the item quantity:");
      quantity = scan.nextInt();
      System.out.println();
      
      ItemToPurchase item2 = new ItemToPurchase();
      item2.setName(name);
      item2.setPrice(price);
      item2.setQuantity(quantity);
      
      System.out.println("TOTAL COST");
      System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + item1.getQuantity() * item1.getPrice());
      System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + item2.getQuantity() * item2.getPrice());
      System.out.println();
      System.out.println("Total: $" + (item1.getQuantity() * item1.getPrice() + item2.getQuantity() * item2.getPrice()));
   }
}

/* CODE OUTPUT IN ECLIPSE: 
Item 1
Enter the item name:
Chip
Enter the item price:
3
Enter the item quantity:
2
Item 2
Enter the item name:
water
Enter the item price:
1
Enter the item quantity:
2
TOTAL COST
Chip 2 @  $3 = $6
water 2 @  $1 = $2

Total: $8

*/
