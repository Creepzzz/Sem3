package se.kth.iv1350.amazingpos.model;
/**
 * Represents one receipt, which proves the payment of one sale. 
 */
public class Receipt {
    private SaleInfo saleInfo;

    public Receipt(saleInfo){
        this.saleInfo = saleInfo;
    }

}
