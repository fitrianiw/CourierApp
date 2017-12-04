public class Order1 {
    private Product product;
    private int quantity;
    private double total;
    private double PPN = 0.1;
    private double discount;

    public Order1(Product product, int quantity, double total, double discount) {
        this.product = product;
        this.quantity = quantity;
        this.total = total;
        this.discount = discount;
    }

    public Order1() {
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the total
     */
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
    
    public double calTotal(){
        double hasil = getProduct().getPrice()*quantity;
        return hasil;        
    }
    
    public double discount(){
        double hasil = discount*calTotal();
        return hasil;
    }
    
    public double PPN(){
        double hasil = PPN*discount();
        return hasil;
    }
    
    public double Total(){
        double hasil = discount()+PPN();
        return hasil;
    }
    
}
