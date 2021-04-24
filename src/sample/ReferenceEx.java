package sample;

public class ReferenceEx {
   static int a=12;
   static int b;
    static String c="asdf";
    static String d="ss";
    public static void main(String[] args) {



    Deneme d= new Deneme(4);
    Deneme d2= new Deneme(5);
    // d ve d2 nin adresleri memory de aynı yeri gösterir
    d2=d;
    //d nin değeri değişince d2 de aynı adresi gösterdiği için değeri değişir.
d.s=44;
        System.out.println(d.s);
        System.out.println(d2.s);
    }
}
class Deneme
{
    int s;

    public Deneme(int s) {
        this.s = s;
    }
}