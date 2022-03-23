package StudyHallSessions.Week4;

public class Session2 {
    public static void main(String[] args) {

        ///Write a program that will print your name 5 times. (Please use for loop logic);

//        System.out.println("Renastech");
//        System.out.println("Renastech");
//        System.out.println("Renastech");
//        System.out.println("Renastech");
//        System.out.println("Renastech");

        String myName="Renastech";

        for (int i=0; i<5; i++){ //i= 0; 0++ = 1; 1++ => 2; 2++ => 3 . 3++ => 4 , 4++ => i=5

            System.out.println(myName);
        }

        //// write a program that will print numbers from 15 to 5 as ascending. Please use for loop
        //Expected output: 15 14 13 12 11 10 9 8 7 6 5


        //   i=4   ;       4>=5 ==> false
        for (int i=15; i>=5; i-- ){ // i=15, 15-- => 14; i-- => 14-- => 13.... 5.. i=4

            System.out.print(" "+i);
        }

        System.out.println();
        System.out.println("*******************");
        ///Write a program that will print count of the odd numbers from 0 to 20 Please use foor loop and if statment.

        // note: to check odd number =>  number %2 !=0 === number %2 =1;

        int count=0; // we will update value;

        for(int a=0; a<20; a++  ){  // a=0 , a=1, a=2; a=3; a=4 ,

            // a divided by 2 and remainder is not 0
            if ( a %2 !=0 ){ // a =0  ==> a % 2 !=0  false;  1 %2 !=0 true , 2 %2 !=0 false, 3 %2 !=0 true , 4 %2 != 0 false;

                System.out.println(a);

                count ++; // 0++ =1, 1++ count 2,  count++ 2++ => 3,
                // when a=1 count =1,  when a =3 , count =2
                System.out.println("****************");


            }

        }


        System.out.println("count = " + count);

        System.out.println("******************************");
        ////Write a program that will print sum of the even numbers between 0-20 is* include . Please use for loop and if statement.

        //note : fori >> puts all for loop

        int sum =0;// we will update in the future

        for (int i = 0; i <=20 ; i++) { //i=0 , 0++ = 1 ; i=2 ... i=20 , 20++ => 21

            //for i=20  20<=20
            //for i=21  21<=20? false

            if (i %2==0){  // 1 %2==0 because my statement false it will ignore if
                // 2 %2 ==0 ?  . 20 %2==0 ?

                System.out.println(i);

                sum+= i; //0 +0 = 0+2+4



            }



        }

        System.out.println("sum = " + sum);




    }
}
