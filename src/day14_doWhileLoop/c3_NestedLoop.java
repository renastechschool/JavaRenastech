package day14_doWhileLoop;

public class c3_NestedLoop {

    public static void main(String[] args) {
        //nested if : if inside another if
        //nested loop : loop inside another loop

        //example :
        //for loop inside for loop
        //while inside for loop
        //dowhile inside while
        ///... any loop can be inside of any loop

        for (int i=0 ; i <3 ; i++){ //0 1 2
            System.out.println("Java");//0 1  2
            //0 1 2
            //0 1 2
            //0 1 2
            //parent loop will run this child loop 3 times for condition 0 1 2
           for (int j=1; j<5 ;j++){ //1234    //01 02 03 04 ; 11 12 13 14 ;  21 22 23 24
               System.out.println("python");
           }


        }

        System.out.println("**************");

        for (int i=1; i <4 ; i ++){//1 2 3
            System.out.println("Parent loop start point");

            for (int k =3 ; k < 6 ; k++){ //3 4 5
                System.out.println("child loop is running i is "+i + " , k is "+k);

            }

            System.out.println("Parent loop end ");
        }

        //i = 1
            //k == 3 4 5
        //i =2
            //k== 3 4 5
        //i = 3
            //k== 3 4 5


        //print me following
        //10 row 2 column
        //* * * * *
        //* * * * *
        //* * * * *

        for (int i =1 ; i<=10 ; i++){
            System.out.println("* * * * * * * * * * * *"); // 10 rows 12 columns
        }

        System.out.println("_------------------------------------------------------------------------");

        int totalRow=5 ;
        int totalColumn=7 ;
        /*
         * * * *
         * * * *
         * * * *
         */

        for (int i=1 ; i<=totalRow ; i++){ // 1 2 3

            for (int j=1; j<=totalColumn ; j++){ //1 2 3 4
                System.out.print("* ");

            }
            System.out.println();//to move on next row (next line )

        }

        System.out.println("_------------------------------------------------------------------------");

        int totalRow2=4;
        int totalColumn2=4;

        for (int i = 1 ; i<=totalRow2 ; i++){
            int j=1;
            while (j<=totalColumn2){
                System.out.print("* ");
                j++;
            }

            System.out.println();

        }


    }
}
