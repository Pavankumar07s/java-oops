package Multithreading;

public class World2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println("world2");
        }
    }
}
