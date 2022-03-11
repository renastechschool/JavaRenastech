package StudyHallSessions.Week2;

public class Session2 {

    // main
    //psvm

    public static void main(String[] args) {
        // Relational Operator
        /**
         * 1- == equals
         * 2  != not equal
         *  > greater han
         *  < less than
         *  <= less than or equal
         *  >= greater than or eqaul
         *
         */

        // Logical operator
        // &&  and
        //  || or
        //  ! not

        // IF condition
        /**
         *   if ( condition ){
         *
         *
         *   }
         *
         */

        if( true ){
            System.out.println("Hello World");
        }

        if( false ){
            System.out.println("Hello Mars!");
        }

        int number1= 20;
        int number2 =21;


        // 20 > 21  false
        if (number1 > number2){
            System.out.println(" Number1 is bigger than number2 ");
        }

        System.out.println("*************");
        /// 20  not equal 21
        if (number1 != number2){

            System.out.println("Numbers are not equal");
            System.out.println("Hello world");

        }

        System.out.println("*****************");
        /**
         * Create a string variable with today's data Example: "March 2";
         *
         * Create another varible with newrozDate and put value of the Newroz date "March 21";
         *
         * if todaysDate and newrozDate are equals print Happy Newroz.
         */

        String todayDate="March 10";

        String newrozData ="March 21";

//         March 10 equal March 21
        if (todayDate == newrozData){
            System.out.println("Happy Newroz");

        }


        todayDate="March 21";  // we updated value of the Todaydate
//        March 21 == March 21
        if (todayDate == newrozData){
            System.out.println("🔥🔥🔥🔥🔥✌️✌ ️Happy Newroz 🔥🔥🔥🔥🔥✌️✌️");

        }

        System.out.println("*****************");

        // If else

        int num1=99;
        int num2= 45;


//          99 > 45
        if (num1 > num2){

            System.out.println(num1 +" is bigger");//99 is bigger

        }else{
            System.out.println(num2 +" is bigger");
        }

        System.out.println("***************");

        if ( !false ){
            System.out.println("Hello World");

        }else{
            System.out.println("Hello Mars");
        }

        // if - if else - else

        // if (condition1) {
        //  }
      //   if else (second)
        // else

        int number3= 40;

        int number4=50;

        int number5=60;

        //   false  and  false  // first condtion
        // 40 > 50    and         40> 60
        if (number3>number4 && number3 >number5  ){

            System.out.println(number3 + " is max. number");

            //    50 > 40             50 > 60
            //      true      and      false >> false
        }else if (number4 > number3 && number4 > number5 ){
            System.out.println(number4 +" is max number");

        }else{
            System.out.println(number5 +" is max. number");

            ///         60      is max. number

        }

        System.out.println("*****************");

        if (false){
            System.out.println("Hello Sanjay");

        }else if(false){
            System.out.println("Hello Esra");

        }else if(!false){
            System.out.println("Hello Ezgi");

        }else {
            System.out.println("Hello Murat");

        }










    }
}
