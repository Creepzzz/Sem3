package se.kth.iv1350.amazingpos.model;

public class SaleInfo{

    /**
     * Creates a basis for the sale information
     * @param item          Item in the sale
     * @param itemDTO       Information about the item
     * @param sale          The sale the information is formed from
     */
    public SaleInfo(Item item, ItemDTO itemDTO, Sale sale, Total total){
        this.item = item;
        this.itemDTO = itemDTO;
        this.sale = sale;
        this.total = total;
    }

    /**
     * Updates the saleinfo, adding to the total value
     * @param saleInfo
     */
    public void updateSaleInfo(SaleInfo saleInfo){
        total = new Total();      //ändra
    }
}