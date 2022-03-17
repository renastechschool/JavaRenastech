package day09_StringMethods;

public class c1_StringMethods {
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


          //concat()	          Appends a string to the end of another string	            String

          String firstName="Hello";
          String lastName="World";

          // + was used to concat strings
          System.out.println(firstName + " " + lastName );

          System.out.println(firstName.concat(" "+lastName));
          System.out.println(firstName.concat(" ").concat(lastName));

          System.out.println("********");

          int score=90;
          String fullName= firstName.concat(" ").concat(lastName);

          //number + text = text

          System.out.println(fullName.concat(" score is : ").concat(score+""));


         // contains()	     Checks whether a string contains a sequence of characters	       boolean

          //contains will check if the string contains given value
          //if string contains it will return true
          //if string doesnt contains it will give you false

          String sentence="Java is fun@@233!";
          System.out.println(sentence.contains("a")); //true
          System.out.println(sentence.contains("A")); //false
          System.out.println(sentence.contains("Ja"));//true
          System.out.println(sentence.contains("Ja "));//false
          System.out.println(sentence.contains("va "));//true
          System.out.println(sentence.contains("@2@"));//false

          boolean b1=sentence.contains(" ");

          System.out.println("*************");

          //endsWith()	     Checks whether a string ends with the specified character(s)	    boolean
            //if your string ends with given condition it will be true
          //if it is not ending it will be false

          String sentence2="Hello world java is here 47";
          System.out.println(sentence2.endsWith("7"));
          System.out.println(sentence2.endsWith("47"));
          System.out.println(sentence2.endsWith(" 47"));
          System.out.println(sentence2.endsWith("here47"));//false
          System.out.println(sentence2.endsWith("Hello world java is here 47"));


      }

}
