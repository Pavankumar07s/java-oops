package Multithreading.ReentranExxample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
    private final Lock lock= new ReentrantLock();
    public void outer(){
        lock.lock();
        try {
            System.out.println("outer method");
            inner();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }

    }
    public void inner(){
        lock.lock();
        try {
            System.out.println("inner method");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }  finally {
            lock.unlock();
        }

    }
    public static void main(String[] args) {
        ReentrantExample reentrantExample = new ReentrantExample();
        reentrantExample.outer();
    }
}
