package io.github.tomcr00ze;

public class Main2 {
    public static void main(String[] args) {
        Cat c = new Cat();
        //note:
        //identifiers cant contain spaces or start with a number like:
        //Cat 1xyz = new Cat();
        //but the following will work as an identifier:
        //Cat xyz1 = new Cat();

        //something like "x=yz" also wont work
        //Cat x=yz = new Cat();
        //NOTE -- but something like a dollar sign would work, important to know for java cert exam
        //Cat x$z = new Cat();

        //using behaviours/actions/tasks
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
