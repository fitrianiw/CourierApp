
package fitri.com;

/**
 *
 * @author user
 */
public class OrderDiscountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrderWithDiscount order = new OrderWithDiscount();
        order.setProductName("Kentang Goreng");
        order.setPrice(25000.0);
        order.setQuantity(7);
        System.out.println("Bayar : " + order.calculateOrderWithDiscount());
    }
    
}
