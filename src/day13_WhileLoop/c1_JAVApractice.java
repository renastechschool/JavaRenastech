package day13_WhileLoop;

public class c1_JAVApractice {
    //write a java program that will check numbers from 1-50
    //if number is divisible by 2 print JA                      number % 2 ==0
    //If number is divisible by 3 print VA                      number %3  ==0
    //If number is divisible both by 2 and 3 JAVA               number % 2==0  &&  number %3 ==0
    //if it is not divible by 2 or 3 print number itself        number % 2!=0  &&  number %3 !=0

    //expected result : // 1  2    3    4    5   6 ...50
                        // 1  JA   VA   JA   5  JAVA

    public static void main(String[] args) {
        //int i=6;

        //starting point =1
        //ending point = 50
        //iteration +1
        String result="";

        //get the count of numbers that are divisible by 2 and 3 at same time
        int count2and3=0;

        for (int i =1 ; i<10000 ; i++){  // for i =1  i=2 i3

            if (i % 2 == 0 && i % 3==0 ){//true
                result += "JAVA ";
                count2and3++;
            }else if (i % 3==0 ){
                result +="VA ";
            }else if ( i % 2 == 0 ){
                result +="JA "; //result = 1 JA
            }else {
                result += i + " "; //result= 1
            }

        }


        System.out.println("result = " + result);
        System.out.println("count2and3 = " + count2and3);


    }

}
