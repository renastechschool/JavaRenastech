package day11_StringMethods;

public class c3_StringPractice {

    //        //How do you split a sentence based in specific character?

    public static void main(String[] args) {
        String sentence="Hello java is planet ,java is fun java is best language";

        //split from second java
            //i need index number of j to use in substring
        int indexOfJava=sentence.indexOf(",j") +1;
        int indexOfJava2=sentence.indexOf("java is f");
        int indexOfJava3=sentence.lastIndexOf(",j")+1;

        String splitedSentece=sentence.substring(indexOfJava2);
        System.out.println(splitedSentece);

        System.out.println(sentence.length());

        //last index number
        System.out.println(sentence.length() -1 );//last index number
        System.out.println(sentence.lastIndexOf("e"));
    }
}
