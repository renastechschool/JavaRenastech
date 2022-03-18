package day10;

public class C1_StringMethods {
    public static void main(String[] args) {
           /*

Method	              Description                                                     	Return Type
charAt()	          Returns the character at the specified index (position)	        char
concat()	          Appends a string to the end of another string	                    String
contains()	          Checks whether a string contains a sequence of characters	        boolean
endsWith()	          Checks whether a string ends with the specified character(s)	    boolean
equals()	          Compares two strings. Returns true if the strings are equal,
                      and false if not	                                                boolean
equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean
indexOf()	          Returns the position of the first found occurrence
                      of specified characters in a string	                            int
isEmpty()	          Checks whether a string is empty or not	                        boolean
lastIndexOf()	      Returns the position of the last found occurrence of
                      specified characters in a string	                                int
length()	          Returns the length of a specified string	                        int
replace()	          Searches a string for a specified value, and returns
                      a new string where the specified values are replaced	            String
replaceFirst()	      Replaces the first occurrence of a substring that matches the
                      given regular expression with the given replacement	            String

startsWith()	      Checks whether a string starts with specified characters	        boolean
substring()	          Extracts the characters from a string,
                      beginning at a specified start position,
                      and through the specified number of character	                    String
toLowerCase()	      Converts a string to lower case letters	                        String
toUpperCase()	      Converts a string to upper case letters	                        String
trim()	              Removes whitespace from both ends of a string	                    String

     */


   //     isEmpty()	          Checks whether a string is empty or not	                        boolean

        String school = "Renastech";

        System.out.println(school.isEmpty()); //false

        String s1= "";
        boolean b1 = s1.isEmpty(); // true

        System.out.println(b1); //true because there isn't any value inside the string.

        String name=" ";  // space is a character.

        System.out.println(name.isEmpty()); //false

        String myName="Maryam";

        if (myName.isEmpty()){ // since my condition is false it will ignore the statement/body
            System.out.println("Hello World");
        }


        // notes: isEmpty() method works only with String
        int number1=34;
      //  System.out.println(number1.isEmpty()); ==> we will get an error since my variable is int.



        //length()	          Returns the length of a specified string	                        int

        String s2="Renastech"; // it starts to calculate with 1.
        //
        System.out.println(s2.length()); // 9

        String s3="Java"; //4
        System.out.println(s3.length());//4

        System.out.println("**************");

        String s4=" "; //1
        System.out.println(s4.length());

        System.out.println("************");

        String s5="";
        System.out.println("s5 length is = "+ s5.length()); // s5 length is = 0

        System.out.println("*************");
        String s6="  ";
        System.out.println("s6 length is = "+s6.length());

        System.out.println("Printing last index of the String");

        String name2="Java";
        // index ==== 0123

        System.out.println("name2 length is "+name2.length()); //name2 length is 4

        System.out.println(name2.charAt(3)); // index 3 => a
        System.out.println("*****************");

        //               Java.lenght =>4
        int name2Lenght = name2.length();

        System.out.println("name2Lenght = " + name2Lenght);
//                                      4 -1 ==> 3
        System.out.println(name2.charAt(name2Lenght-1) );

        String str1 = "Sinan"; // length --> 5
        //             01234

        System.out.println("str1.length() = " + str1.length()); //str1.length() = 5
        System.out.println("*********************");
        //printing n

        // length == 5 , last index is 4

        //   5-1 => 4

        System.out.println(str1.charAt(4)); // n
//                           Sinan . charAt()            5 -1 => 4
        System.out.println(str1.charAt( str1.length()-1) );

        System.out.println();






    }
}
