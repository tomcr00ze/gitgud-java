package io.github.tomcr00ze; //declare name of the package/folder this class is located

import java.sql.SQLOutput;

public class Cat { //an object named cat
    //class - tool of the language to describe an object

    //attributes : we have 2 here, name and age
    String name; //name is an attribute of object or our class "Cat" and "String" is the data type of the attribute. String in java is a sequenec of characters

    int age; //int - Java reserved keyword for integer data type, age is attribute of type age

    /*
    String is  a builtin class in java, not a keyword. int is a keyword because its one of the special data types in Java called primitives

    primitive data types and thus all are keywords in Java:
    byte, short, int, long, float, double, char, boolean
     */


    //we can declare our own constructor but we dont need it as we have a default constructor, this is jsut to show to create our own constructor that will print() a statement everytime the cat constructor is executed
    //notice that unlike other methods, does not have a return type as it is a constructor. its only purpose is to create the instance and when we use a constructor in java, we use it with the new keyword
    Cat(){
        System.out.println("a cat was created");
    }

    //behaviour --> represents what a specific object can do
    //sayMeow() is the name of a method, a behaviour/task of the object cat
    void sayMeow(){ //name of the behaviour should be an action word
        //parenthesis and curly brcaces should come after the behaviour/method
        //void --> keyword to say that the method wont return a value
        System.out.println("Meow from the Cat.java file"); //prints meow to the console
    }

    void sayMeowWithMyName(){
        System.out.println("Meow my name is: " + this.name); //"this." is a keyword
        //it can also work without the "this.": System.out.println("Meow my name is: " + name);
        //but "this." makes it more clearer that the "name" is the value of the object (this) that is executing the current behaviour (sayMeowWithMyName)
        /*
        like say for example:
        x.name = "leo"; in Main2.java file
        the "x" there becomes the "this" on this java file
        this.name
        basically "this" takes the value of the instance from which you called the behaviour. we can omit it on our behaviour but the this makes it more readable
         */
    }
}
