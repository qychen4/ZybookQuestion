
import java.util.*;

public class ItemToPurchase {

	String itemName;
	int itemPrice;
	int itemQuantity;
	
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ItemToPurchase item1 = new ItemToPurchase();
		System.out.println("Enter the item name: ");
		item1.itemName = scnr.nextLine();
		System.out.println("Enter the item price: ");
		item1.itemPrice = scnr.nextInt();
		System.out.println("Enter the item quantity: ");
		item1.itemQuantity = scnr.nextInt();

		

	}
}
