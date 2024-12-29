package Multithreading.FareandUnfareLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example {
    private final Lock fair=new ReentrantLock(true);
    public void accessResource(){
        fair.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" accuired the lock");
             Thread.sleep(1000);
        } catch (RuntimeException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            fair.unlock();
            System.out.println(Thread.currentThread().getName()+" realesed the lock");
        }
    }

    public static void main(String[] args) {
        Example example = new Example();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };

        Thread thread1 = new Thread(runnable,"pavan");
        Thread thread2 = new Thread(runnable,"kaushik");
        Thread thread3 = new Thread(runnable,"tiwari");
        try{
            thread1.start();
            Thread.sleep(2000);
            thread2.start();
            Thread.sleep(2000);
            thread3.start();
            Thread.sleep(2000);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }

    }
}
