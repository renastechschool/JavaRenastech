package day05_ifStatements;

public class c3_minNumber {
    // 3  different   variable
    //x=400 y=200 z=300   //output should be minumum number is 200
    //x=100 y=200 z=300    //output should be minumum number is 100
    //x=300 y=100 z=400   //output should be minumum number is 100


    // if x is the minumum number  that means x<y and x<z
   // if y is the minimum number that means y<x and y<z
   // if z is the minimum number that means z<x and z<y

    public static void main(String [] args){
        //to be able to apply my logic
        //1.i will create 3 numbers
        //2.create 3 boolean condtion to check which boolean is true
        //3. create 3 if condition to check boolens and print minumum number

        int x=200;
        int y=1000;
        int z=1500;

        boolean xMin=x<y && x<z; //200<100 && 200<150 //false
        boolean yMin=y<x && y<z; //100<200 && 100<150 //true
        boolean zMin=z<x && z<y; //150<200 && 150<100 //false


        if (xMin){
            System.out.println("Minimum number is "+x);
        }

        if (yMin){
            System.out.println("Minimum number is "+y);
        }
        if (zMin){
           System.out.println("Minimum number is "+z);
        }





    }

}
