package Multithreading;

public class Mythread1 extends Thread{
    Mythread1(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState()+"- Priority "+ Thread.currentThread().getPriority()+ "count "+i);
            Thread.yield();//shedular ko bolta hai ki dusre thred ko chance de sakte hai
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Mythread1 low = new Mythread1("low");
        Mythread1 med = new Mythread1("med");
        Mythread1 high = new Mythread1("high");

        low.setPriority(Thread.MIN_PRIORITY);
        med.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        med.start();
        high.start();

    }
}
