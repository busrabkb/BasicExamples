package sample;

public class arrayCopyReference {

    public static void main(String[] args) {
        int a[] = { 1, 8, 3 };

        // Create an array b[] of same size as a[]
        int b[] = new int[a.length];

        // Doesn't copy elements of a[] to b[],
        // only makes b refer to same location
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
