package day15_Arrays;

public class c2_Array {

    public static void main(String[] args) {
        //declaration of array
        //DataType [] name={.......}

        int [] numberList= {10,20,30,40};
                         // 0 ,1  ,2 ,3

        String [] names={"Java","Python","C#", "fsdf" , "wer","235423",",fmnsdfm"};
                      //    0        1     2 ,   3        4       5        6

        //print python
        System.out.println("names[1] = " + names[1]);
        //print 30
        System.out.println("numberList[2] = " + numberList[2]);

        //print all the names
        //i need use a loop
        //starting point 0
        //ending point last index = length -1

        for (int i =0 ; i<=6 ; i ++ ){
            System.out.println(names[i]);

        }

        int [] numbers= { 1,5,19,20, 35,5 ,0 ,100 ,200, 400 };

        //numbers[4] == this means index number 4 from numbers

        if (numbers[2] > numbers[5]){ //19 > 5
            System.out.println("2nd index from numbers list is bigger then index number 5");
        }else {
            System.out.println("2nd index from numbers list is smaller then index number 5");
        }

        String engineer= new String(); // this will only store one engineer
        String [] engineers=new String[5];//size for this continer defined as a 5 //index numbers ==01234
        //array size is fixed . you will need to specify the length when you create array
        //size has to be passed []
        //for enginneers array you have size == 5  (number will be assigned as soon as you create the array)
        //since we didnt define index numbers all the index will be null

        System.out.println("engineers[2] = " + engineers[2]); //null
        engineers[2] = "SDET2";
        System.out.println("engineers[2] = " + engineers[2]); //this wont be null anymore
        //beacuse we assign to SDET2
        engineers[4]="Dev1";
        System.out.println("engineers[4] = " + engineers[4]);

        //length of array
        int length = engineers.length;//5
        System.out.println("length = " + length);

        //print all enginners
        for (int i =0 ; i<=engineers.length -1 ;i++ ){
            System.out.println(engineers[i]);
        }


        //can i create a booleean container
        //boolean [] listOfBooleans={true,false,true,false,true};
        boolean [] listOfBooleans2=new boolean[3];
        //if you dont assign anything to booleans , java will take false as default
        System.out.println(listOfBooleans2[0]);//default value is false

        listOfBooleans2[0]=true;
        listOfBooleans2[1]=true;
        listOfBooleans2[2]=false;
        System.out.println(listOfBooleans2[0]);
        System.out.println(listOfBooleans2[1]);
        System.out.println(listOfBooleans2[2]);

        System.out.println("******************");

        boolean [] list1={true,false,true,true,true,false,true,true};

        System.out.println(list1.length +"   --");//

        //create an java program that will check boolen values
            //if value is true print passed
            //if value is false print failed

        for (int i =0 ; i < list1.length  ; i++){

            if (list1[i]){ //list[0] , list[1]  .... list[list1.length -1]
                System.out.println("passsed"); //0  2 3 4 ..
            }else {
                System.out.println("failed"); //1 5
            }

        }


    }
}
