package MyUtils;

public class GenericUtils {

    //print a hello
    public static void hello(){
        System.out.println("Hello Hello");
    }

    //reverse a string
    public static void reverseString(String name){
        String reversedResult="";

        for (int i =name.length() -1 ; i >=0 ; i--){
            reversedResult += name.charAt(i);
        }

        System.out.println("reversedResult = " + reversedResult);
    }

}
