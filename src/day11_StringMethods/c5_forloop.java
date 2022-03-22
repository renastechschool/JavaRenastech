package day11_StringMethods;

public class c5_forloop {

    public static void main(String[] args) {
        //starting point = 8
        //ending point = -1
        //iteration -1
        for (int i = 8 ; i > -2 ; i--){ // i =8 ,7 6 5 4 3 2 1 0 -1 -2
            System.out.println("Gule");//8 7 6 5 4 3 2 1 0 -1
        }
        //starting point =0
        //ending point = 4
        //iteration -1
        //loops will be running until your condition gets false
        //if condition always true . Your loop will be infinitive loop
//        for (int i=0 ; i <5 ; i--){ //i =0  -1 -2 -3 .......................
//            System.out.println("abe");//0 -1 -2 -3 ....................
//        }

        //starting point =10
        //ending point = -1
        //iteration +1
        for (int l=10; l<0 ; l++){ // l=10  11 12
            System.out.println("Oscar");
        }//0 times

//        //starting 10 ending 1 iteration +1
//        for (int k=10; k>0 ; k++){
//            System.out.println("Muhammed");
//        }infinitive

        for (int k=10; k>0 ; k--){//10 , 9 , 8 ........1 0
            System.out.println("Ebubekir");//10 , 9 , 8 ........1
        }

        for (int k=10; k>0 ; k -=3){//10 , 7 4 1  -2
            System.out.println("Ege");//10 7 4 1
        }

        //create an condition that will print square numbers from 0 10
        //square of number means number * number
        //output
        // number0  0
        // number1  1
        // number2  4
        // number3  9
        //...
        // number10 100


        for (int number=0 ; number <=20 ; number++){//0 ,1,2 3,4 5 ... 10 11

            //number * number == to get square of the number
            System.out.print("Number is " + number);

            System.out.println(" Square of number is " + (number * number));//0 ,1,2 3,4 5 ... 10
        }

    }
}
