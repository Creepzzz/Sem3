package se.kth.iv1350.amazingpos.controller;

import se.kth.iv1350.amazingpos.model.*;
import se.kth.iv1350.amazingpos.intergation.*;
/**
 * 
 * This is the application's only controller. All calls to the model pass through this class.
 *
 */

public class Controller {
	private Sale sale;
	private InventorySystem inventorySystem;
	private AccountingSystem accountingSystem;
	private ItemCatalog itemCatalog;
	private Printer printer;
	private SaleInfo saleInfo;
	/**
	 * Starts a new sale. This method must be called first before the process of a sale.
	 */
	public void startSale() {
		this.sale = new Sale();
	}
  /**
   * Creator of controller
   *
   * @param systemCreator     Getter of classes of external system calls
   * @param catalogCreator    Getter of classes of external catalog calls
   * @param printer           Interface to the printer
   */
	public Controller(SystemCreator systemCreator, CatalogCreator catalogCreator, Printer printer){
		this.accountingSystem = systemCreator.getAccountingSystem();
		this.inventorySystem = systemCreator.getInventorySystem();
		this.itemCatalog = catalogCreator.getItemCatalog();
		this.printer = printer;
	}

	/**
	 * The validity of the item is checked
	 * Gets item from the catalog and adds it to the sale
	 * Updates the catalog
	 *
	 * @param itemIdentifier    Specify the item
	 * @param quantity          Specify the number of items
	 */
	public void registerItem(int itemIdentifier, int quantity){
		if(checkItem(itemIdentifier)){
			Item item = itemCatalog.getItem(itemIdentifier,quantity);
			itemCatalog.updateCatalog(ItemDTO itemDTO);
			sale.addValidItem(itemIdentifier,quantity);
		}
	}

	/**
	 * Checks validity of an item
	 * @param itemIdentifier   Specify the item
	 * @return                 Returns true if item exists
	 */
	public boolean checkItem(int itemIdentifier){
		return itemCatalog.itemExists(itemIdentifier); //funktion ny namn
	}

	/**
	 * Creates a payment and adds the ammount paid
	 * @param paidAmmount      Specifies the ammount customer has paid
	 */
	public void paid(int paidAmmount){
		Payment payment = new Payment(paidAmmount, sale.getTotal());
		accountingSystem.updateAccount(sale.getTotal());
		inventorySystem.updateInventory(saleInfo);
	}
}
