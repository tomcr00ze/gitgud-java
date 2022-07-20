package io.github.tomcr00ze;

public class Main2 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sayMeow(); //using dot operator, but this time to call the action of the behaviour of the instance c
        //will print: "Meow from the Cat.java file"
        c.name = "Tom";
        c.sayMeowWithMyName();
        //will print: Meow my name is: Tom

        var x = new Cat();
        x.name = "leo";
        x.age = 1;
        x.sayMeowWithMyName();
        //will print: Meow my name is: leo
    }
}
