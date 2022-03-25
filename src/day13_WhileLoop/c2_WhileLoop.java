package day13_WhileLoop;

public class c2_WhileLoop {

    public static void main(String[] args) {

        //structure of for loop

        for (int i =0 ; i<100 ;i++){
            //starting point int i=0
            //ending point 99 condition i<100
            //iteration ==
        }

        //while loop : while loop will keep running as long as while condition is true
        //initilization will be outside of while loop

        int i =0; //inizilition\
        //starting point =0

        while (i <11){//condition : as long as condition is true while will run 0
            //ending point =10
            System.out.println("Hello world " + i); //0 1 2 3 4...10

            i++; //iteration

        }


//        while (100>95){//condition = true ---->> as long as condition is true while loop will run
//            System.out.println("java");
//
//        }//infinitive loop

        int number1=5;
        //java reads from top the bottom
        while (number1 > 0){ //5 4 3 2 1        0 cant run
            System.out.println("number1 = " + number1); //5 4 3 2 1
            number1--;//4 3 2 1 0
        }//4 3 2 1 0


        int number2=5;
        //java reads from top the bottom
        while (number2 > 0){ // 5 4 3 2 1        0 cant run

            number2--;//4 3 2 1 0
            System.out.println("number2 = " + number2);// 4 3 2 1 0

        }//4 3 2 1 0


    }
}
