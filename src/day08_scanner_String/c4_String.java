package day08_scanner_String;

//import java.lang.String; no need to import because java will import everything under lang package auto

public class c4_String {

    public static void main(String[] args) {

        //to create a string
        String str="Hello world";

        /*
            in Java, string is an object that represents a sequence of characters.
            The java.lang.String class is used to create a string object.

            How to create a string object?
            There are two ways to create String object:

            1.By string literal
            2.By new keyword
        */
        //create an string object
        // 1.By string literal
        //Java String literal is created by using double quotes.
        // For Example:
        //String str1="Hello";

        //Each time you create a string literal, the JVM checks the "string constant pool" first.
        // If the string already exists in the pool, a reference to the pooled instance is returned.
        // If the string doesn't exist in the pool, a new string instance is created and placed in the pool.

        //for example :
        // 1.By string literal
        String str1="Hello"; // java will check pool and since we dont have "Hello"
        //java will create a new string in the pool memory
        String str2="Hello";// this wont create a new string under pool memory
        //because we already created hello .
        //// If the string already exists in the pool, a reference to the pooled instance is returned.

        //reason of java is using string literal logic is to make java memory more efficient

        //2.By new keyword
        String str3=new String("Hello");
        //java will create an object (string) called Hello under java heap memory (not pool memory)





    }
}
