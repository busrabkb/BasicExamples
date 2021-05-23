package sample;

public class arrayCopyReference {

    public static void main(String[] args) {
        int a[] = { 1, 8, 3 };


        int b[] = new int[a.length];


        b = a;

        // b ve a aynı yeri gösterir ancak ikisi ayrı fieldlardır
        b[0]++;
        System.out.println(b[0]);
        foo(b); //pass by reference özelliği geçerlidir
        System.out.println(b[1]);
    }
    static void foo(int[] b)
    {
        b[1]=123;
    }
}
