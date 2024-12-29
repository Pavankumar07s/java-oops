public class Main {
    public static void main(String[] args) {
        int a=5;
        boolean b=true;
        char c='a';
        long e=256254454l;
        String d ="pagan";

        d+="kumar";
        float f=45465465.646566f;
        double g=46565654.649565654644;
        int[] arr=new int[5];
        String[] arr1=new String[10];
        for(String ku:arr1){

            System.out.println(ku);
        }
        boolean[] arrbool =new boolean[10];
        arr[0]=5;
        arr1[0]="pavan";
        for(String ku:arr1){

            System.out.println(ku);
        }
        System.out.println(arr[0]);
        System.out.println(arr1[0]);
        System.out.println(arrbool[0]);
        System.out.println((int)c);
        System.out.println((int)Character.MIN_VALUE+" "+(int)Character.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(b);
        System.out.println(d);

        String nameOfS="pavan";
        int length = nameOfS.length();
        System.out.println(length);
    }

}
