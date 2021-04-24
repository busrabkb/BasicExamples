package sample;

public class StaticObjectEx {
  static   TestCls obj= new TestCls("s");

    public static void main(String[] args) {

    }
}

class TestCls
{   private static int stAge=8;
    private String name;

    public TestCls(String name) {
        this.name = name;
    }
}
