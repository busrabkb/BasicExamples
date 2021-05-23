package sample;

/* Java program to show that if static methods are redefined by
a derived class, then it is not overriding but hidding. */

// Superclass
abstract  class Base {
int a;

     Base(int a) {
        this.a = a;
    }

    public static void display() {
        System.out.println(" display from Base");
    }

    public void print() {
        System.out.println(" from Base");
    }
}


class Derived extends Base {
 private  int i;

    public Derived(int i) {
        super(12);
        this.i = i;
    }

    public static void display() {
        System.out.println("Non-static method from Derived");
    }

    // Static is added here (Causes Compiler Error)

}
class staticOverride
{

    public static void main(String[] args) {
      //  Derived.display();
        Derived d= new Derived(1);
        d.print();

    }
}
