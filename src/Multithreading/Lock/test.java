package Multithreading.Lock;

public class test {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        BankAccount1 bankAccount1 = new BankAccount1();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    bankAccount1.withdraw(500);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread1 = new Thread(runnable,"pavan");
        Thread thread2 = new Thread(runnable,"kaushik");
        thread1.start();
        thread2.start();
    }

}
