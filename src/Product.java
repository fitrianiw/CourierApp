public class Product {
    private String namaProduct;
    private double price;
    private Product variantProduct; // membuat objek dengan class itu sendiri

    public Product(String namaProduct, double price) {
        this.namaProduct = namaProduct;
        this.price = price;
    }

    public Product() {
    }

    /**
     * @return the namaProduct
     */
    public String getNamaProduct() {
        return namaProduct;
    }

    /**
     * @param namaProduct the namaProduct to set
     */
    public void setNamaProduct(String namaProduct) {
        this.namaProduct = namaProduct;
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
     * @return the variantProduct
     */
    public Product getVariantProduct() {
        return variantProduct;
    }

    /**
     * @param variantProduct the variantProduct to set
     */
    public void setVariantProduct(Product variantProduct) {
        this.variantProduct = variantProduct;
    }
    
    
}
