package sample;
// Java program to demonstrate
// why a non-static variable cannot
// be accessed from a static context

// Creating a class A
class Count {

    int a;


    public static void increment()
    {
        //  compile - time error verir çünkü hangi nesnenin a değerinin geldiğini göremez
      //  a++;
    }
}

public class StaticExample {

    public static void main(String args[])
    {

        Count obj1 = new Count();
        Count obj2 = new Count();
        Count obj3 = new Count();

     obj1.a = 3;
        obj2.a = 4;
        obj3.a = 5;


        Count.increment();

        System.out.println(obj1.a);
        System.out.println(obj2.a);
        System.out.println(obj3.a);
    }
}
