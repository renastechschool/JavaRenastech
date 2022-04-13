package day20_ReturnMethods;

public class c3_retunrMethods {

    public static void main(String[] args) {

        String firstName="Hello";
        String lastName="World";
        System.out.println(firstName + lastName);
        //String method
        System.out.println(firstName.concat(lastName));

        System.out.println(concatStrings("hello" ,"world"));

        boolean result= equalNames("Hello " , "World");
        System.out.println("result = " + result);
    }

    //create a method that will concat 2 string
    public static String concatStrings(String name1,String name2){
        return name1.concat(name2);
    }

    //  create a logic that will check given names are equal
    // 2 string to compare 2 parameter
    //to be able to ccompare equal
    //return type is boolean
    public static boolean equalNames(String str1 , String str2){

        return str1.equals(str2);
    }

    ///what ever you want to have as a return make sure your method type is same as return
    //parameters are what ever you wanted to pass your method

}
