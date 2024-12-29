package Interface.multipleInheritance;

public class SmartPhone implements Camera,SoundPlayer,Phone {
    @Override
    public void poweeon() {

    }

    @Override
    public void poweeoff() {

    }

    @Override
    public void playSound() {
        System.out.println("sound start");
    }

    @Override
    public void stopSound() {
        System.out.println("sound stop");
    }

    @Override
    public void makeCall() {
        System.out.println("called");
    }

    @Override
    public void takePhoto() {
        System.out.println("photo clicked");
    }
}
