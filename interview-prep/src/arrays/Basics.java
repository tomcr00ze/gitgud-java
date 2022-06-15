package arrays;

public class Basics {
    public static void main(String[] args) {
        //the syntax for array:
        //datatype[] variableNameOfArray = new datatype[sizeOfArray];
        //example
        int[] simpleIntegerArray = new int[5];
        //basically says that the reference variable "simpleIntegerArray" is pointing to an array object of size 5 "new int[5]" that contains a type of integer elements, which is denoted by the "int[]" of the left hand side of "int[] simpleIntegerArray"
        //size must be mentioned (as see on "new int[5]") or else it'll give an error
        /*
        breaking it down...

        int[] simpleIntegerArray
        --> what happens here is the declaration of the array
        --> "integerArray" is getting defined in the stack.
        --> the reference variable integerArray is not currently pointing to anything so it gets pointed to an object

        simpleIntegerArray = new int[5]
        --> where actual memory allocation happens
        --> object gets created in the memory (heap)
        --> "new" keyword is used to create objects

        int[] simpleIntegerArray = new int[5];
        --> int[] simpleIntegerArray :: happens at compile time
        --> = new int[5] :: happens at runtime. creates the object in memory (heap), called "dynamic memory allocation" where memory is allocated at runtime
         */

        //NOTE: by default, integer arrays have a default value of "0"
        //NOTE: indexes for arrays in Java start with 0, so if we're aiming to access the first element we put the "arrayName[0]" like for example if we access and print simpleIntegerArray array's elements in the first index and its 2nd index:
        System.out.println(simpleIntegerArray[0]); //prints the first element of the array, which is 0
        System.out.println(simpleIntegerArray[1]); //prints the first element of the array, which is still 0 because again, the default value is 0

        //another way, a more direct way of creating an array. this time setting both the size and values as well in one line
        int[] simpleIntegerArray2 = {2,4,6,8,10}; //all values must be of same type
        //the reference variable "simpleIntegerArray2" points to the array object "{1,2,3,4,5}"
        System.out.println(simpleIntegerArray2[0]); //prints 2
        System.out.println(simpleIntegerArray2[1]); //prints 4




    }
}
