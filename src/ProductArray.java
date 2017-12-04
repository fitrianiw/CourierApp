
public class ProductArray {
    public static void main(String[] args) {
        Product iceCream = new Product("Magnum", 8000.0);
        Product indomie = new Product("Indomie", 2500.0);
        Product cocaCola = new Product("Coca Cola", 4500.0);
        
        Product[] products = {iceCream, indomie, cocaCola};
        double totalBayar = 0.0;
        for (Product product : products){
            totalBayar += product.getPrice();
        }
        System.out.println("Total Bayar Belanjaan : " + totalBayar);
    }
    
}
