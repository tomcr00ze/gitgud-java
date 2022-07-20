package io.github.tomcr00ze;

public class Main2 {
    public static void main(String[] args) {
        //note:
        //identifiers cant contain spaces or start with a number like:
        //Cat 1xyz = new Cat();
        //but the following will work as an identifier:
        //Cat xyz1 = new Cat();

        //something like "x=yz" also wont work
        //Cat x=yz = new Cat();
        //NOTE -- but something like a dollar sign would work, important to know for java cert exam
        //Cat x$z = new Cat();

        Cat c = new Cat();
        //will print: "a cat was created" because in our Cat file, we put a print task to our constructor Cat(){}
        //Cat() --> default constructor, must be name of the class we are using followed by parenthesis

        //using behaviours/actions/tasks
        c.sayMeow(); //using dot operator, but this time to call the action of the behaviour of the instance c
        //will print: "Meow from the Cat.java file"
        c.name = "Tom";
        c.sayMeowWithMyName();
        //will print: Meow my name is: Tom

        var x = new Cat();
        //will also print: "a cat was created" because in our Cat file, we put a print task to our constructor Cat(){}
        //var --> java 10 keyword will automatically take the type assigned of the right side of the equal operator
        x.name = "leo";
        x.age = 1;
        x.sayMeowWithMyName();
        //will print: Meow my name is: leo
        /*
        in the end, this program will print:

        a cat was created
        Meow from the Cat.java file
        Meow my name is: Tom
        a cat was created
        Meow my name is: leo
         */
    }
}
