package se.kth.iv1350.amazingpos.model;

/**
 *      Represents one item
 */
public class Item{

    /**
     *  Creates an item for the sale
     * @param itemDTO      Speficies the qualities of the item
     * @param quantity     Specifies the quantity of the item
     */
    public Item(ItemDTO itemDTO, int quantity){
        this.itemDTO = itemDTO;
        this.quantity = quantity;
    }
}