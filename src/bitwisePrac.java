public class bitwisePrac {
    public static void main(String[] args) {
        int a=5;
        int b=4;
        char charhai='a';
        float f=1254.255f;
        int c=a&b; //and
        int d=a|b; //or
        int e=a^b; //xor
        int NOT=~a; //not
        int rightshift=a>>1;
        int leftshift =a<<1;
        System.out.println(Integer.toBinaryString(a));
        System.out.printf("%s of %d and %d is %d :","sum",a,b,(a+b));
        System.out.println();
        System.out.printf("%c and %f is:",charhai,f);
    }
}
