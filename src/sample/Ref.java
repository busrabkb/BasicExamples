package sample;

public class Ref {
   static int a=12;
   static int b;
    static String c="asdf";
    static String d="ss";
    public static void main(String[] args) {

        b=a;
        a=4;

        System.out.printf("b:"+b);
        System.out.printf("a:"+a);


        d=c;
        c="ll";

        System.out.printf("b:"+d);
        System.out.printf("a:"+c);
    }
}
