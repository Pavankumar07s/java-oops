package Multithreading.Sincronization;

public class Counter {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
//    public synchronized void increment(){

            //isske critical section bolte hai
//         //sync se ye hota hai ki ek baar main ek thread access kar sakta hai or agar hum sync na use kare usse hum race condition bolte hai ,to sync karke humne mutual exclution acchive kiya hai jisase hum 1 time main ek hi thread ke sath resource share karte hai
//            this.count++;
//
//    }
    public synchronized void increment(){

        //sync block se hum ek code ko sync kar sakte hai and function ko sare threads access kar sakte hai
        synchronized (this){
            this.count++;
        }
    }
}
