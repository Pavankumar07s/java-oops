package Multithreading.Sincronization;

import java.lang.Thread;

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.setCount(0);
        MyThread myThread1 = new MyThread(counter);
        MyThread myThread2 = new MyThread(counter);
        myThread1.start();
        myThread2.start();

        try{
            myThread1.join();
            myThread2.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.getCount());
    }
}
