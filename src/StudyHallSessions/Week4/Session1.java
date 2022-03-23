package StudyHallSessions.Week4;

public class Session1 {

    public static void main(String[] args) throws Exception {

        /**
         *   Write a program to calculate the sum of first 20 natural number.
         *  0+1+2+3+4+5+6+... 20 = ?
         *
         */

        //We will create for loop
        //Create a varibale to store dat

        int sum = 0;

        //Starting point , ending point
        for (int i=0; i<=20; i++ ){
            //0 , 1, 2 , 3, 4, 5, 6

            System.out.println("***************");
            System.out.println("i equals to >>>>> " + i);// i=1; i=2, i=3+1; i=4; i=5 , i=6

            sum +=i; //sum = 0+0=0,   0+1= 1, 1 +2= sum >> 3,  3+=3==> sum=6, 6+4= 10 , 10+5== 15+6=21


            System.out.println("Sum is >>>> "+sum);
            System.out.println("**********");

        }

        System.out.println("+++++++++++++++++++++++++++++");

        //   Write a program to find the factorial value of any number entered through the keyboard.
        // 5=? ==>  1 * 2 *3 * 4 *5
        // 6= ? 1 *2 *3 *4 *5 *6

        //Step1 -Variables
        int myNumber= 6 ; // 1 * 2 * 3 *4 ++
        int answer= 1 ; //0

        //s point  ;  ending p.
        for (int i= 1; i<=6; i++ ){
            //i=1; i=2; i=3; i=4; i=5 ; i=6;

            answer *=i; // == answer=answer*i//  1 *1 =1 , 1*2 = 2, 2 *3 =6;
                                         // answer=6 , 6* 4 =24
                                        // answer=24 , 24 *5= 120
                                       /// 120 *i == 120 *6 =720

        }

        System.out.println("answer == " +answer);


        System.out.println("***************");
        System.out.println("**************");
        //  write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
        //

        for (int i=0; i<=100; i++ ){

            // 0  , 1  ,.... i=15

            // odd number ,  divisible by 3  , divisible by 5
            if ( i %2!=0 &&  i% 3 ==0  && i%5==0 ){
                // for i=15 ture && true && true

                System.out.println(i);

            }


        }




    }
}
