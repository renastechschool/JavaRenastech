package StudyHallSessions.Week5;

public class Session2 {

    public static void main(String[] args) {
        /**
         * //    Write a program that can print the numbers between 1 ~ 100
         * that can be divisible by 3, 5, and 15. Please use while loop
         *         //
         *         //  if the number can be divisible by 3, 5 and 15, then it
         *         should only be displayed in DivisibelBy15' section
         *         //
         *         // if the number can be divisible by 3 but cannot be divisible by 15,
         *         then it should only be displayed in DivisibelBy3' section
         *         //
         *         // if the number can be divisible by 5 but cannot be divisible by 15,
         *         then it should only be displayed in DivisibelBy5' section
         */

        //Step-1 Create variables

        String DivisibelBy15="";
        String DivisibelBy3="";
        String  DivisibelBy5="";

        //Step 2- Initilize logic
        // 1 ~ 100
        int number=1; // starting point

        while (number < 100){

            // step 3- if statements
            //if the number can be divisible by 3, 5 and 15,
            if ( number % 3==0  && number %5==0 && number %15==0){
                // should only be displayed in DivisibelBy15' section
                DivisibelBy15 += number + " ";
            }

            //// if the number can be divisible by 3 but cannot be divisible by 15,
            if( number %3 ==0 &&  number % 15 !=0 ){

                // then it should only be displayed in DivisibelBy3' section
                DivisibelBy3 +=number +" ";

            }

            //// if the number can be divisible by 5 but cannot be divisible by 15,
            if (number %5==0 && number %15 !=0){
                // then it should only be displayed in DivisibelBy5' section
                DivisibelBy5 += number+" ";

            }

            // last step increment

            number++;




        }

        System.out.println("DivisibelBy15 = " + DivisibelBy15);
        System.out.println("DivisibelBy3 = " + DivisibelBy3);
        System.out.println("DivisibelBy5 = "+DivisibelBy5);


    }
}
