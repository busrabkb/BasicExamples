package sample;



class IIBTest {

    {
        System.out.println("IIB1 block");
    }


    {
        System.out.println("IIB2 block");
    }


    IIBTest() { System.out.println("Constructor "); }


    {
        System.out.println("IIB3 block");
    }


    public static void main(String[] args)
    {
        IIBTest a = new IIBTest();
    }
}


class B {
    B() { System.out.println("B-Constructor "); }

    {
        System.out.println("B-IIB block");
    }
}


class A extends B {

    A()
    {
        super();
        System.out.println("A-Constructor ");
    }
    {
        System.out.println("A-IIB block");
    }

    public static void main(String[] args)
    {
        A a = new A();

    }
}
