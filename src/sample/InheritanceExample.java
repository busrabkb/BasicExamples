package sample;

 class EnglishGreeting extends Greeting {

    public void print() {
        // the InheritanceTestTwo class inherits variables
        // and methods from InheritanceTestOne
        System.out.println(exampleVariableOne + " subclass");
        printer();
    }
}

 class Greeting {

    public String exampleVariableOne = "Hello World!";

    public void printer() {
        System.out.println(exampleVariableOne + " superclass");
    }
}

public class InheritanceExample {

    public static void main(String[] args) {
        EnglishGreeting englishGreeting = new EnglishGreeting();
        englishGreeting.print();
    }
}
