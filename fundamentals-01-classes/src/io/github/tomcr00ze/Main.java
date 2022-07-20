package io.github.tomcr00ze;

public class Main { //classes start with a capital letter
    public static void main(String[] args) { //main method of our program, the place where execution of the program starts from
        //what can we do inside the main method/begining of our program?
        Cat x; //we can declare a variable/identifier to store the reference of an instance of the Cat class
        //to create an instance of the class, we need: "new Cat();"
        //we can create as many instances of Cats as we want, like
        /*
        //this creates 3 objects of type cat:
        new Cat();
        new Cat();
        new Cat();
         */
        x = new Cat(); //we assign c the reference of the object we created with the instantiation syntax "new Cat();"
        //new --> new is an operator in java, it is a keyword to create instances of objects
        //Cat(); --> Cat is a constructor in this case
        //instantiation --> the operation of creating an instance of the object (that is described by the Cat class)
        //we create an instance somewhere in memory, and the reference to the instance is assigned to the variable we defined, in this case x

        //at the same time we can create an instance AND declare the variable
        Cat y = new Cat();
        //the left side of the equal operator --> Cat y --> declaration
        //the right side --> new Cat() --> instantiation using the new operator and the constructor

        //JAVA 10
        //we can create an instance with this starting in Java 10
        var z = new Cat(); //var is a keyword (though arguably not really a keyword)

        //dot operator -- used to refer any of the attributes of the instances
        x.name = "Tom"; //can be read as: the "name" of "x" is assigned with the value of "Tom"
        y.name = "Leo"; //name of y cat is now Leo
        z.name = "Kit";

        x.age = 1;
        y.age = 2;
        z.age = 3;

        //System.out.println(); --> print to the console
        System.out.println(x.name); //will print: Tom
        System.out.println(x.age); //will print: 1
        //TODO:
    }
}
