package inheritance;

public class GrandParent {


    private int age;
    private String name;
    public GrandParent(){
        System.out.println("grand Parent constructor called");
    }

    public GrandParent(int age, String name) {
        this.age=age;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
