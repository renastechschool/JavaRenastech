package day09_StringMethods;

public class c2_StringMethods {

//    equals()	          Compares two strings. Returns true if the strings are equal,
//                          and false if not	                                                boolean
//    equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean
    public static void main(String[] args) {

        String word1="Hello";
        String word2="Hello";//will be under pool memory
        String word3=new String("Hello"); //heap memory
        String word4=new String("Hello");
        String word5="Java";

        System.out.println(word1.equals(word2));
        System.out.println(word1.equals(word3));
        System.out.println(word2.equals(word3));
        System.out.println(word3.equals(word4));
        System.out.println(word1.equals(word5));
        System.out.println("*********************");
        System.out.println(word1 == word2);//true
        System.out.println(word1 == word3);
        System.out.println(word2 == word3);
        System.out.println(word3 == word4);
        System.out.println(word1 == word5);

        //equals method will only care exact text match
        //it wont check how variables get created

        //== operater will also care how those varibles getting created
        //anything you create with new keyword is totaly a new object


        //    equalsIgnoreCase()	  Compares two strings, ignoring case considerations	         boolean
        System.out.println("************************");
        String str1="Java";
        String str2="JAVA";
        String str3="JaVa";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));

        boolean b1=str1.equalsIgnoreCase(str3); // true
        boolean b2=str1.equals(str2);           // false
        boolean b3=str3.equalsIgnoreCase(str2); // true

        if (b1){//true
            //inside if will be excuted if b1 is true
            System.out.println("b1 is true"); // this will run

            if (b2){//false
                //inside b2 if will not run
                System.out.println("b2 is true");
                if (b3){
                    System.out.println("b3 is true");
                }else {
                    System.out.println("b3 is false");
                }
            }else {
                System.out.println("b2 is false"); //this will run
            }

        }else {//false

            System.out.println("b1 is false");
        }



    }
}
