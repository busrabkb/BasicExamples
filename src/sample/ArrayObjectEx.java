package sample;

class ArrayObjectEx {

    public static void main(String args[]) {

        Student[] arr;
        arr = new Student[2];

        arr[0] = new Student();
        arr[1] = new Student();

        arr[0].setData(123, "Büşra");
        arr[1].setData(234, "Hatice");

        arr[0].display();

        arr[1].display();
    }
}

class Student {

    public int id;
    public String name;


    public void setData(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("Student id: " + id + " "
                + "Student name: "
                + name);
        System.out.println();
    }
}
