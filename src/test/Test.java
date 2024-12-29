package test;

import inheritance.Child;

public class Test {
    static {
        System.out.println("run before the java main function");
    }

    public static void main(String[] args) {
        Child child=new Child (15,"pavan");
    }


}
