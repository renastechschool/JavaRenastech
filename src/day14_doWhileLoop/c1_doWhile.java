package day14_doWhileLoop;

public class c1_doWhile {

    public static void main(String[] args) {
        //for loop
        //while loop
            //it will run as long as your condition is true
            //it is going to stop running once your condition turns to false

        //dowhile
            //it will run once at the begining no mather your while condition is true or false
            //it will continue to run if while is true


        int number=10;

        while (number<10){ //since condition is false
            //it wont print anything from body of while loop
            System.out.println("While loop");
        }

        do { //do while run at least one time no mather condition is true or false
            System.out.println("do while ");

        }while (number<10); //false

//        do {
//            System.out.println("hello");
//        }while (number==10);//10 == 10 true   infinitive loop

        int number2=3;
        do {
           // number2++;                                  //4 5 6 ...9 10
            System.out.println("number2 = " + number2); //3  4 5 ... 9
            number2++;

        }while (number2 < 10); //4 5

        //starting point 3
        //ending point 9
        //iteration ++

        int number3=5;
        do {
            System.out.println(number3); //5
            number3--;//4
        }while (number3 < 0); //4 < 0 false
        //you are out of your loop

        //printing even numbers from 0 - 100
        //starting point 0
        //ending point 100
        //to get total count of even numbers
        int count=0;
        int number4 =0 ;
        do {

            if (number4 % 2==0){
                count++;
                System.out.print(number4 + " , ");
            }

            number4++;
        }while (number4 <= 100);

        System.out.println();

        System.out.println(count);
    }
}
