package sample;

public class FinalObject {

    public static void main(String args[])
    {
        final TestFinal t = new TestFinal();
        //t.p int yani primitive tip old için referens tip değildir final nesnenin içinde kaldığı için setlenebilir
        t.p = 30;
        System.out.println(t.p);
        TestFinal t2 = new TestFinal();
        //
       // t = t2;

    }
}
class TestFinal
{
    int p = 20;

}