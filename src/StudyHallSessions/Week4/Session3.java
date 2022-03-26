package StudyHallSessions.Week4;

public class Session3 {

    public static void main(String[] args) {

//        while (true){
//            System.out.println("renastech");
//        }

        //Write   a   program   that   will   count   how   many   times   “a"   is   found   in   any   given   String:
    //String mystring="java is fun, but sometimes java is just pain.Love java java java";

        String mystring= "java is fun, but sometimes java is just pain.Love java java java";
        //                0123 ,  length = 4;

        int countOfA=0;// it will be updated.

        //             4  < 4
        for (int i=0; i<mystring.length(); i++ ){ // i=0; 0++ --> 1; 1++ >2 2++ -->3  , 3++ > 4

            if (mystring.charAt(i)=='a'){ // mystring.charAt(3)=>  a=='a'

                countOfA++; // 0++ -> 1; 1++ > 2;
            }

        }

        System.out.println("countOfA = " + countOfA);

        System.out.println("*************************");
        //Create a program that will print numbers that divisible by 4 and 3 from  0 - 99 .Please use While loop;

        //Step-1 : Create variables
        int startingPoint=0;
        int endingPoint=99;

        //step-2 create my loop

        //     0 <= 99=> true
        //     1<=99
        //    2<=99
        // 99
        // when it's 100 <= 99

        ///    12 <= 99 true
        while (startingPoint<=endingPoint){

            //Step-3 Create if statement
            if (startingPoint % 4==0 && startingPoint %3==0 ){ // 0 %4 ==0 true &&  0 %3==0 ,, 1 %4==0 false && false
                //   12 % 4==0? true && 12 %3==0 tru3

                System.out.println(startingPoint); //0 ,12
            }

            startingPoint++; // 0++ ; 1++


        }

        System.out.println("***********************");
        ////Create a program that will reverse a string , Please use While loop.

        //Step-1 Variables:

        String str="Sevgin";
        //          012345

        // exptected >> nigveS
        String myReverse=""; // we will update it

        //             6 -1
        int startPoint=str.length()-1;
        int endPoint=0;

        //Step 2 -Create your loop
         //  5 >= 0
        //  4>=0
        //....
        // 0>=0
        // -1 >= 0
        while (startPoint >=endPoint) {

            //         str.charAt(5)==n;
            //          str.charAt(4)=i
            //
            //        str.charAt(0)..>> S
            myReverse+=str.charAt(startPoint); // "ni...S"

            startPoint--; // 5-- > 4...... 0 > 0-- > -1


        }

        System.out.println("myReverse = " + myReverse);
        System.out.println("***************");

        ////Create a program that will reverse an int , Please use while loop.

        int myNumber=34;
        // 34 % 10 ?? 4

        // reverse of the 34 >> 43
        // exmaple 123 >> 321

        //Step1 Create variables
        int reverseInt=0;

        //Step 2- Create your loop

        //   34 !=0
        //    3 !=0
        // 0 !=0  >> false

        while (myNumber != 0){

            int remainder = myNumber %10 ; // 4, mynumber = 3  remainder==>  3 % 10 ==>3;

            reverseInt= reverseInt *10 +remainder;
            //           0 *10 => 0 +4 >>> reverseint = 4;
            //           4 *10 ==> 40 +3 =>> 43

            myNumber /=10; // 34/10 == > 3 ,,,  3/10 == my number ==0



        }

        System.out.println("reverseInt = " + reverseInt);
        System.out.println("reverseInt = " + reverseInt);


    }
}
