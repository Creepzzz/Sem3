package se.kth.iv1350.amazingpos.model;

public class Total{

    public Total(int ammountPaid){
        this.ammountPaid = ammountPaid;
    }
    /**
     *  Adds to the total cost
     * @param saleInfo    Saleinfo contining information of the total cost
     */
    public void addTotal(SaleInfo saleInfo){
        this.saleInfo = saleInfo;
    }
}