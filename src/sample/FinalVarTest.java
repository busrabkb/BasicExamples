package sample;

public class FinalVarTest {
 static final int[] arr2 = {1, 2, 3};

    public static void main(String[] args)
    {  final int s;
        s=5;
        int arr[] = {1, 2, 3};

        for (final int i : arr)
            System.out.print(i + " ");
  //main içinde kullanılan değişkenler static olmalıdır
        for (final int i : arr2)
            System.out.print(i + " ");



}  }




class Test
{
   // final void m1()
  //  {
    //    System.out.println("This is a final method.");
    //}
}

class Test2 extends Test
{
    void m1()
    {
        // COMPILE-ERROR! Can't override.
        System.out.println("Illegal!");
    }
}