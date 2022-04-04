package day15_Arrays;

public class c1_arraysIntro {

    public static void main(String[] args) {
        //int , double , float , string
        //each varible has own value

        int number1=10;
        int number2=20;
        int number3=30;

        int number4=45 , number5=25 ;

        //if you want to store multiple values in one container,list

        //arrays : containers for multiple variables
        //arrays will stroe multiple values inside each contatiner
        //arrays has some ready methods that you can modify your variables

        //declararion of array
        //DataType [] nameOfYourContainer = { data1,data2,data3 ...} data==variable

        //container for numbers
        //int container,double contoiner ,float container ....
        //integer container
        //DataType [] nameOfYourContainer = { data1,data2,data3 ...}
        int [] numbers={10,20,30,40,50,190,3,5,0,10};
        //you cannot store any other data type
        //array has index numbers
                     // 0 , 1 ,2 ,3 ,4 ,5 6...    9==length -1

        //print third number== 30 (index 2)

        //hello
        //each letter is index
        //container
        //each data will has the index
        System.out.println( numbers[2] );

        //print first number
        System.out.println( numbers[0] );

        //second number == 20 index = 1
        int secondNumber= numbers [1];

        System.out.println("secondNumber = " + secondNumber);

        System.out.println("numbers[15] = " + numbers[15]);//ArrayIndexOutOfBoundsException
        //total we had 10 numbers which last index is 9 for the last one
        //we dont have index 15


    }


}
