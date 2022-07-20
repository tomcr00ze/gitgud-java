package io.github.tomcr00ze;

public class Main { //classes start with a capital letter
    public static void main(String[] args) { //main method of our program, the place where execution of the program starts from
        //what can we do inside the main method/begining of our program?
        Cat c; //we can declare a variable/identifier to store the reference of an instance of the Cat class
        //to create an instance of the class, we need: "new Cat();"
        //we can create as many instances of Cats as we want, like
        /*
        new Cat();
        new Cat();
        new Cat();
         */
        c = new Cat(); //we assign c the reference of the object we created with the syntax "new Cat();"
        //new --> new is an operator in java, it is a keyword to create instance
        //Cat(); --> Cat is a constructor in this case
        //instantiation --> the operation of creating an instance of the object (that is described by the Cat class)
    }
}
