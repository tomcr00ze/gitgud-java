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

    //behaviour --> represents what a specific object can do
    //sayMeow() is the name of a method, a behaviour/task of the object cat
    void sayMeow(){ //name of the behaviour should be an action word
        //parenthesis and curly brcaces should come after the behaviour/method
        //void --> keyword to say that the method wont return a value
        System.out.println("Meow from the Cat.java file"); //prints meow to the console
    }
}
