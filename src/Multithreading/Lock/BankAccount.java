package Multithreading.Lock;

public class BankAccount {
    private int TotalAmount=1000;
    public synchronized  void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" "+"is tring to to withdraw");
        if(TotalAmount>=amount){
            System.out.println(Thread.currentThread().getName()+"is proceding to withdraw"+" "+amount);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            TotalAmount-=amount;
            System.out.println("transection done ,remaining balance"+" "+TotalAmount);
        }else {
            System.out.println("incefficient balance");
        }
    }
}
