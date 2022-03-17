package day09_StringMethods;

public class c3_StringMethods {
    //charAt()	          Returns the character at the specified index (position)	        char
    //indexOf()	          Returns the position of the first found occurrence
    //                      of specified characters in a string	                            int
    //isEmpty()	          Checks whether a string is empty or not	                        boolean
    //lastIndexOf()	      Returns the position of the last found occurrence of
    //                      specified characters in a string	                                int


    public static void main(String[] args) {

        String sentence = "Hello world . Java is here lo";
                         //012345

        char ch=sentence.charAt(3);
        System.out.println(ch); //second l
        System.out.println(sentence.charAt(2)); // first l

        //indexOf()	          Returns the position of the first found occurrence
        //                      of specified characters in a string	                            int

        System.out.println(sentence.indexOf("l"));//it will check first matching 'l' from sentence
        // and returns index number which is 2
        System.out.println(sentence.indexOf("ll")); // index will be 2
        System.out.println(sentence.indexOf("lo")); //index will be 3
        //since there is 2 lo it will give us first matching one

        int index=sentence.indexOf(" lo"); //this will give you index of space that you had at last
        //if you need to have index of l +1

        System.out.println(index);
        System.out.println(index +1 );

        //get last index of letter e
        //e lo
        //re + 1
        //e
        System.out.println(sentence.indexOf("e lo"));//25
        System.out.println(sentence.indexOf("e "));
        System.out.println(sentence.indexOf("re") +1 );


        //lastIndexOf()	      Returns the position of the last found occurrence of
        //                      specified characters in a string	                                int

        System.out.println(sentence.lastIndexOf("e")); //25

        System.out.println("***************");
        String sentence2 = "Hello world . Java is here llllllo";

        //to get  index for  last l
        System.out.println(sentence2.lastIndexOf("l"));

        //index of first l
        int indexFirstl=sentence2.indexOf("l");
        int indexLastl=sentence2.lastIndexOf("l");
        int indexSecondl=sentence2.indexOf("lo");
        int indexBeforeLastl=sentence2.lastIndexOf("llo");

        System.out.println(indexFirstl + " , " + indexLastl);
        System.out.println(indexSecondl + " , "+indexBeforeLastl);
    }
}
