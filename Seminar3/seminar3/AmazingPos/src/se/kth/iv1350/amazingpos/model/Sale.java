package se.kth.iv1350.amazingpos.model;

import java.time.LocalTime;
/**
 * One single sale made by one single customer and payed with one payment. 
 */
public class Sale {
	private LocalTime SaleTime;
	private Receipt receipt;
	private Item item;
	private SaleInfo saleInfo;
	private Payment payment;
	private ItemDTO itemDTO;

	/**
	 * Creates a new instance and saves the time of this sale.
	 */
	public Sale() {
		SaleTime = LocalTime.now();
	}

	/**
	 * Adds valid item to the sale
	 * @param quantity      Specify the quantity of the item
	 * @param item          Item that will be added
	 */
	public void addValidItem(int quantity, item){
		SaleInfo saleInfo = SaleInfo.SaleInfo(item, itemDTO, sale);  //Ändra
	}

	/**
	 * Adds the ammount paid to the payment and updates the external systems
	 * @param payment       Payment that control the updates
	 */
	public void addAmmountPaid(payment){
		AccountingSystem.updateAccount(saleInfo);           //ändra
		InventorySystem.updateInventory(saleInfo);          //ändra
		receipt = new Receipt();
	}
}
