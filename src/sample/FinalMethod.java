package sample;

class FinalMethod
{
    // final void m1()
    //  {
    //    System.out.println("This is a final method.");
    //}
}

class Test extends FinalMethod
{
    void m1()
    {
        // COMPILE-ERROR! Can't override.
        System.out.println("Illegal!");
    }
}