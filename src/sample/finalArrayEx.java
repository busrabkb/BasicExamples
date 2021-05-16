package sample;

import java.util.Arrays;

public class finalArrayEx {
    final int arr[] = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        finalArrayEx arrayEx = new finalArrayEx();
        //aşağıdaki gibi direkt arraye atama yapılırsa hata verir cünkü arrayler objecttir ve  final bir object e referens atanamaz
        //arrayEx.arr=new int [1];
        arrayEx.arr[1] = 111;
        Arrays.stream(arrayEx.arr).forEach(val ->

                System.out.println("arr values: " + val)
        );
    }
}
