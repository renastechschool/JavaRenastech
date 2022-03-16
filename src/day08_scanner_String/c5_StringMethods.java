package day08_scanner_String;

public class c5_StringMethods {

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

    public static void main(String[] args) {

//        Method	              Description                                              	Return Type
//        charAt()	          Returns the character at the specified index (position)	        char

        String str="Gule";
                  //0123
        //index numbers always starts with 0 in java
        System.out.println(str.charAt(1));//char letter which is index 1 == u

        char letterU=str.charAt(1);
        char letterG=str.charAt(0);

        System.out.println(letterG);

        //char ch=str.charAt(4);//StringIndexOutOfBoundsException
        //because our range is from 0 - 3
        //System.out.println(ch);
        System.out.println(str);

        String word = "Hello world@!2";
                    // 012345678910
        //anything you see in the string will have an index number

        System.out.println(word.charAt(5));//space

        System.out.println("word charat10 : "+word.charAt(10));

    }
}
