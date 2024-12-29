package Multithreading;

public class Test {
    public static void main(String[] args) {
        //Method 1 using extend
        World world = new World();//New
        world.start();//Runnable state
        //Method 2 using implement
        World2 world2 = new World2();
        Thread thread = new Thread(world2);
        thread.start();

        for (int i = 0; i < 100000; i++) {
            System.out.println("hello");
        }

    }
}
