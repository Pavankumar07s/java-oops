package Multithreading;

public class Mythread2 extends Thread{
    @Override
    public void run() {
       while (true){
           System.out.println("hello");
       }
    }

    public static void main(String[] args) {
        Mythread2 mythread2 = new Mythread2();
        mythread2.setDaemon(true);//deamon thread jo hote hai voo jaise jvm apna main thread ka kaam hota hai and user thread ka kaam hota hai to vo terminate kar deta hai application.Deamon thread to ek background mian chalne wala thread hai jisse jvm consider nahi karta usse countinue karna if sare kaam ho gaye hooo....
        mythread2.start();
        System.out.println("main khatam ho gaya hai");

    }
}
