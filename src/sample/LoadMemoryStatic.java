package sample;

public class LoadMemoryStatic {
  static   int number   ;
  static final String str = null;
  static final int a;
    static
    {
        a=5;
      number  =9;
    }

    public LoadMemoryStatic() {
      System.out.printf("constructor run");

    }
}
