package Multithreading;

public class Mythread extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Running");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Mythread mythread = new Mythread();
        System.out.println(mythread.getState());
        mythread.start();
        System.out.println(mythread.getState());
//        mythread.interrupt();//iska mtb hota hai jo bhi kaam threads kar raha ahi usse roko aagar sleep pe hai to sleep interupt karo
        Thread.sleep(100);
        System.out.println(mythread.getState());
        mythread.join();
        System.out.println(Thread.currentThread().getState());//Main MyThread
        System.out.println(mythread.getState());
    }
}
