package fitri.com;
public class OrderExample {

public static void main(String[] args){
    Order order = new Order("Chitato", 7650.0);
    order.setQuantity(5);

    System.out.println("Yang harus dibayar : " + order.calculateOrder());
    System.out.println("Yang harus dibayar %,.2f \n", order.calculateOrder());
    System.out.println("Yang harus dibayar %,.2f \n", order.calculateOrder());
}
}
