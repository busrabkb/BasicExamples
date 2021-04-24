package sample;

public class FinalFieldAssigneEx {
final static int number;
final String name;
//surname field myMethod içinde tanımlanamadığı için hata verir.
//final String surname;
static {
    number=12;
}

    public FinalFieldAssigneEx() {
    //alt satır hata verir çünkü static bir field static metod içinde çalışır
    // static final ise constructor yerine static blok içinde tanımlanabilir.
    //number=25;
    //final fieldlar constructor içinde veya tanımlandığı ilk yerde değer ataması yapılabilir.
        name="busra";
    }

    private void myMethod()
    {
    //    surname="";
    }

}
