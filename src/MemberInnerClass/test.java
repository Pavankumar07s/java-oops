package MemberInnerClass;

public class test {
    public static void main(String[] args) {
//        inner class
//        Car tataSafari = new Car("tata safari");
//        Car.Engine engine = tataSafari.new Engine();
//        engine.start();
//        engine.stop();

        Car2 bmw = new Car2("bmw");
        Car2 mercedes = new Car2("mercedes");
        Engine engine = new Engine(bmw);
        engine.setCar2(bmw);
        engine.start();
        engine.stop();
        engine.setCar2(mercedes);
        engine.start();
        engine.stop();

    }

}
