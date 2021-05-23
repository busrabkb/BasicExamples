package sample;


class PassByValue {

    // swap() doesn't swap i and j
    public static void swap(Object i, Object j) {
       // Integer temp = Integer.valueOf(i);

        i = j;
     //   j = temp;
    }

    public static void main(String[] args) {
        Object i = 10;

        Object j = 20;
        swap(i, j);
        System.out.println("i = " + i + ", j = " + j);
    }
}