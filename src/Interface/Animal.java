package Interface;

public interface Animal {
    int Max_age=150;
    void sound();

    static void info(){
        System.out.println("this is animal inteface");
    }

    default void run(){
        this.sound();
        System.out.println("animal is running");
    }
}
