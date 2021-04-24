package sample;

public class Outter {
    int number=12;
    String name= "busra";
    static int number2=123;
    static class Inner
    {
        public Inner() {
            number2++;
        }
    }

    class Inner2
    {
        public Inner2() {
            System.out.printf(name+" inner");
            System.out.printf(number+" inner");
            System.out.printf(number2+" inner");

        }
    }

    public static void main(String[] args) {

    }
}
