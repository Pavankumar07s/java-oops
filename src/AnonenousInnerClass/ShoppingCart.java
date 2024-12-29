package AnonenousInnerClass;

public class ShoppingCart{
    public ShoppingCart(int totatAmount) {
        this.totatAmount = totatAmount;
    }

    private int totatAmount;

    public int getTotatAmount() {
        return totatAmount;
    }

    public void setTotatAmount(int totatAmount) {
        this.totatAmount = totatAmount;
    }
    public void processPayment(Payment payment){
        payment.Pay(totatAmount);
    }


}
