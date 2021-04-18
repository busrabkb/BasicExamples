package sample;

import java.util.ArrayList;

public class AutoboxingTest {

    static ArrayList<Integer> aa = new ArrayList<>();
static int intVal=10;

    public static void main(String[] args) {
        //autoboxing ArraayList e Object value atanması için. Veri yapıları
        aa.add(intVal);
    //unboxing
        int unboxingVal= aa.get(0);
        System.out.printf(":" +unboxingVal);
    }
}
