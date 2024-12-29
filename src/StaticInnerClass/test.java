package StaticInnerClass;

public class test {
    public static void main(String[] args) {
        Computer computer = new Computer("aanu", "aby002", "windows");
        Computer computer1 = new Computer("aanu", "aby002", "windows");
        Computer computer3 = new Computer("aanu", "aby002", "windows");



        Computer.Pendrive sandisk = new Computer.Pendrive("sandisk");
//        Computer.Pendrive sandisk=new Computer.Pendrive("sandisk");

        System.out.println(sandisk.getModel());

    }
}
