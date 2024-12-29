package AnonenousInnerClass;

public class test {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(150);
        shoppingCart.processPayment(new Payment(){
            @Override
            public void Pay(int totalamount) {
                System.out.println("payment of 150 done using credit card "+totalamount);
            }
        });
        shoppingCart.processPayment(new Payment() {
            @Override
            public void Pay(int totalamount) {
                System.out.println("payment done using upi");
            }
        });
    }
}
