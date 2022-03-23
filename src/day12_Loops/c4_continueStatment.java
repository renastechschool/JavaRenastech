package day12_Loops;

public class c4_continueStatment {

    public static void main(String[] args) {

        for (int i =0; i<5 ;i++){//i==0 ,1 ,2
            System.out.println("Before break"); //0 1 2

            if (i==2){//2==2 true
                break;// 2
                //when java reachs break it is going to stop the loop
                //anything after break wont run
            }

            System.out.println("After if ");//0 1

        }

        //2

        //print only even numbers from 1 - 10
            //first way you can just look for if (i%2==0) then print  i number
            //second way you can skip the odd numbers by using continue statement

        for (int i=1 ; i<=10 ; i++){

            if (i % 2 ==0){
                System.out.println(i);
            }

        }

        System.out.println("********************");
        for (int i=1 ; i<=10 ; i++){ //i=1 ,2  3  4

            if (i % 2 !=0){ //odd numbers  this will be true for odd numbers
                //which we want to skip odd numbers and print even
                continue;//this will skip odd numbers such as 1 ,3 ,5 ,7 .9
                //System.out.println("hello");
            }
            System.out.println(i);//2  4  6 8 10

        }

        for (int i=0 ; i <5 ;i++){ //0
            System.out.println("before continue " + i); //0  1 2 3 4

            if (i==2){ //2 true
                continue; //skip the 2 for loop
            }
            System.out.println("after continue " + i);//0 1  3  4

        }

        for (int i=0 ; i <5 ;i++){ //0
            System.out.println("before break " + i); //0  1 2

            if (i==2){ //2 true
                break; //skip the 2 for loop
            }
            System.out.println("after break " + i);//0 1

        }

    }
}
