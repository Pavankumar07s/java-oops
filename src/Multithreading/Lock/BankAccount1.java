package Multithreading.Lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount1 {
    private int TotalAmount=1000;
    private final Lock lock =new ReentrantLock();
    public  void withdraw(int amount) throws Exception{

        try {
            //lock.lock(); ye thread main vo wait karte rahega jab tak usse lock access mil nahi jata jabki trylock main vo kisii specific period ka hi wait karta hai usske badh vo abort ho jata hai
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try{
                    System.out.println(Thread.currentThread().getName()+" "+"is tring to to withdraw");
                    if(TotalAmount>=amount){
                        System.out.println(Thread.currentThread().getName()+" is proceding to withdraw"+" "+amount);
                        try {
                            Thread.sleep(3000);
                            TotalAmount-=amount;
                            System.out.println("transection done ,remaining balance"+" "+TotalAmount);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new RuntimeException(e);
                        }
                        }
                    else {
                        System.out.println("incefficient balance");
                    }

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }finally {
                    lock.unlock();//ye command lock ko free karta hai for another thread to accurire the thread
                }
            }
            else{
                System.out.println(Thread.currentThread()+ " "+"coud not accuire the lock try again");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();//yaha manually thread ki state ko resore kar rahe hai if anything goes wrong
            throw new RuntimeException(e);
        }
    }
}
