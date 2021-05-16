package sample;


public class passByReferenceEx {
    public class Balloon {

        private String color;

        public Balloon(){}

        public Balloon(String c){
            this.color=c;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
    void start()
    {
        Balloon red = new Balloon("Red");
        Balloon blue = new Balloon("Blue");

        swap(red, blue);
        System.out.println("red color="+red.getColor());
        System.out.println("blue color="+blue.getColor());

        foo(blue);
        System.out.println("blue color="+blue.getColor());

    }
    public static void main(String[] args) {
passByReferenceEx ex = new passByReferenceEx();
ex.start();
    }

    private  void foo(Balloon balloon) {
        balloon.setColor("Red"); //objectin bir fieldi değişir
        balloon = new Balloon("Green"); // new ile yeni bir yeri referans alır
        balloon.setColor("Blue"); // yeni bir object oalrak sayılır ve bu değişsse bile metodun ilk satırındaki balloon ile aynı değildir
    }


    public  void swap(Object o1, Object o2){
        Object temp = o1; //swap edilen objectlerin referanslarının değişmesi etkilemez. Ancak object içindeki değer değişirse etkilenirdi
        o1=o2;
        o2=temp;
    }
}