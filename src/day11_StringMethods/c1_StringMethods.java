package day11_StringMethods;

public class c1_StringMethods {

    //replace()	          Searches a string for a specified value, and returns
    //                      a new string where the specified values are replaced	            String
    //replaceFirst()	      Replaces the first occurrence of a substring that matches the
    //                      given regular expression with the given replacement	            String
    //
    //startsWith()	      Checks whether a string starts with specified characters	        boolean
    //substring()	          Extracts the characters from a string,
    //                      beginning at a specified start position,
    //                      and through the specified number of character	                    String
    //toLowerCase()	      Converts a string to lower case letters	                        String
    //toUpperCase()	      Converts a string to upper case letters	                        String
    //trim()	              Removes whitespace from both ends of a string	                    String

    public static void main(String[] args) {

        String word="Hello world 123 hello world 123";
        //replace()	          Searches a string for a specified value, and returns
        //                      a new string where the specified values are replaced	            String

        //remove all e from word and pass x as a replecment
        System.out.println(word.replace("e" ,"x"));
        System.out.println(word); // since we didnt reasign word it wont effecct String word .

        String updatedWord= word.replace("world","planet");
        System.out.println("updatedWord = " + updatedWord);

        //replaceFirst()	      Replaces the first occurrence of a substring that matches the
        //                      given regular expression with the given replacement	            String

        String str="Java is here , planet is Java , Java is planet";

        //replacefirst will only replace first matching one
        String newStr=str.replaceFirst("Java","Python");
        System.out.println("newStr = " + newStr);

        System.out.println(str.replace("Java","Python"));


        //startsWith()	      Checks whether a string starts with specified characters	        boolean
        // endsWith()	    Checks whether a string ends with the specified character(s)	    boolean

        System.out.println("*******************");
        String sentence="Java Hello Java 123 world java";

        //check if sentence either startswith or endswith "Java"
        boolean b1=sentence.startsWith("Java") || sentence.endsWith("Java"); //true
        //check if sentence startswith and endswith java
        boolean b2=sentence.startsWith("Java") && sentence.endsWith("Java"); //false

        if (b1){
            System.out.println("Sentence either starting or ending with Java");

            if (b2){
                System.out.println("Sentence starts and ends with Java");
            }else{
                System.out.println("since b1 is true one of part is Java");
            }

        }else{
            System.out.println("Sentence doesnt start or end with Java");
        }


        //substring()	          Extracts the characters from a string,
        //                      beginning at a specified start position,
        //                      and through the specified number of character	                    String

        //we have 2 methods
        //first substring(beginiing index , ending index) :
        //this will print starting given index until the ending index (excluded ending index)
        //second substring(beginiing index) : this will start printing from given index to end of the sentence

        String letters="Hello world Java is fun";
                     // 012345678910   15
        //print world Java is fun
        System.out.println(letters.substring(6));
        //print world Java
        System.out.println(letters.substring(6,15));//world Jav  index 15 wont be included
        System.out.println(letters.substring(6,16));//world Jav

        //print world
        System.out.println(letters.substring(6,10+1));

        //print Hello
        System.out.println(letters.substring(0,4+1));

        //print Java
        //index of J and index of after a
        int indexOfJ=letters.indexOf("J");
        System.out.println("indexOfJ = " + indexOfJ);

//        int indexOfa=letters.indexOf("a ");
        int indexOfa=letters.lastIndexOf("a");
        System.out.println("indexOfa = " + indexOfa);

        System.out.println(letters.substring(12,15+1));


    }
}
