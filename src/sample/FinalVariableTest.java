package sample;

public class FinalVariableTest {
 static final int[] arr2 = {1, 2, 3};

    public static void main(String[] args)
    {  final int s;
    //local fieldlar final olsa bile sonradan atanabilir. Sadece bir değer atandıktan sonra tekrar değer atanamaz.
        s=5;
        int arr[] = {1, 2, 3};

        for (final int i : arr)
            System.out.print(i + " ");
  //main içinde kullanılan değişkenler static olmalıdır
        for (final int i : arr2)
            System.out.print(i + " ");



}  }

