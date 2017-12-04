package fitri.com;

import static com.sun.org.apache.xalan.internal.Version.getProduct;

public class Order {
    private String productName;
    private double price;
    private int Quantity;
    private double total;
    private double discount;
    private double PPN = 0.1;

    public Order(){
        
    }
    
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the Quantity
     */
    public int getQuantity() {
        return Quantity;
    }

    /**
     * @param Quantity the Quantity to set
     */
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public double calculateTotal(){
      return getproductName().getPrice()*this.Quantity;
    }
    
    public double calculatePPN(){
        return calculateTotal()*getPPN();
    }
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the PPN
     */
    public double getPPN() {
        return PPN;
    }

    /**
     * @param PPN the PPN to set
     */
    public void setPPN(double PPN) {
        this.PPN = PPN;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    private Object getproductName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
