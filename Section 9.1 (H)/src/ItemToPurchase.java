
public class ItemToPurchase {
	String itemName;
	int itemPrice;
	int itemQuantity;
	
	public ItemToPurchase() {
		itemName = "none";
		itemPrice = 0;
		itemQuantity = 0;
	}
	
	public void setName(String itemName) {
		this.itemName = itemName;
	}
	
	public String getName() {
		return itemName;
	}
	
	public void setPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public int getPrice() {
		return itemPrice;
	}
	
	public void setQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
	public int getQuantity() {
		return itemQuantity;
	}
}
