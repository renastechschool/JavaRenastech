package day13_WhileLoop;

public class c3_whileLoop {

    public static void main(String[] args) {
        //print below figure
        // *********************  20 star
        //System.out.println("*********************");

        int i=1;//starting point
        //ending point 20
        while (i <=20){ //1  2  3 4 5 6 ..... 20    not for 21
            System.out.print("*");
            i++;//+1
        }

        System.out.println(); //to break the line
        //print below figure with while loop
        /*

         ****
         *  *   6 repeat times
         *  *
         *  *
         *  *
         *  *
         *  *
         ****

         */

        int number=1;

        System.out.println("****");
        while (number < 7){
            System.out.println("*  *");
            number++;
        }
        System.out.println("****");


    }
}
