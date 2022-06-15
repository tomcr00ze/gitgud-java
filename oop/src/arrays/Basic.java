package arrays;

public class Basic {
    public static void main(String[] args) {
        //the syntax for array:
        //datatype[] variableNameOfArray = new datatype[sizeOfArray];
        //example
        int[] simpleIntegerArray = new int[5];
        //basically says that the reference variable "simpleIntegerArray" is pointing to an array object of size 5 "new int[5]" that contains a type of integer elements, which is denoted by the "int[]" of the left hand side of "int[] simpleIntegerArray"
        //size must be mentioned (as see on "new int[5]") or else it'll give an error

        //another way, a more direct way of creating an array. this time setting both the size and values as well in one line
        int[] simpleIntegerArray2 = {1,2,3,4,5}; //all values must be of same type
        //the reference variable "simpleIntegerArray2" points to the array object "{1,2,3,4,5}"

        /*
        breaking it down...

        int[] simpleIntegerArray
        --> what happens here is the declaration of the array
        --> "integerArray" is getting defined in the stack.
        --> the reference variable integerArray is not currently pointing to anything so it gets pointed to an object

        simpleIntegerArray = new int[5]
        --> where actual memory allocation happens
        --> object gets created in the memory (heap)
         */

    }
}
