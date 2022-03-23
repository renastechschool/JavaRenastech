package day12_Loops;

public class c3_BreakStatement {

    public static void main(String[] args) {


        for (int i=1 ; i<=10 ; i++){  // i = 1 ,2 , 3 , 4 ,5 ,6 ,7 ,8 ,9 ,10 ,,11
            System.out.println("java"); // i = 1 ,2 3 ,4 ,5 ,6 ,7 ,8 ,9 ,10

            if (i==4){//i =4
                System.out.println("java2"); // 4
            }

        }
        //

        System.out.println("***************************");
        //break statement
        //anytime java reachs to break statement it will stop execution
        //if java cathcs break inside the loop
        //loop will stop from running
        //anything after break wont be executed

        for (int i =1 ; i <=5 ; i++){
            System.out.println("hello"); // 1 2 3

            if (i==3){// 3
                System.out.println("Stop hello");//3
                break;//loop will be stopped by running here     //3
                //anything after here wont be executed in the loop
            }

            System.out.println("Hello 2"); // 1 2

        }

        System.out.println("Hello again");

//        i=1
//        hello
//        Hello 2

//        i=2
//        hello
//        Hello 2

//        i=3
//        hello
//        Stop hello

//        after loop
//        Hello again

    }
}
