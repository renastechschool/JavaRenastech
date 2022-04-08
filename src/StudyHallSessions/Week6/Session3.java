package StudyHallSessions.Week6;

import java.util.Arrays;

public class Session3 {

    public static void main(String[] args) {
        String [][] menu ={{"Chicken Alfredo","Shrimp Pasta","Lasagna"}, // 0
                {"House Salad","Caesar Salad","Fruit Salad"},//1
                {"Wine","Soda","Amaretto"}, // 2
                {"Tiramisu","Panna Cotta Tart","Baklava"}}; // 3

        for (int i = 0; i <menu[0].length ; i++) {

            System.out.println(menu[0][i]);

            //index 0
            //Chicken Alfredo
            //Shrimp Pasta
            //Lasagna

        }

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%");

        for (int i = 0; i <= menu[3].length -1 ; i++) {

            System.out.println(menu[3][i]);
            //Tiramisu
            //Panna Cotta Tart
            //Baklava

        }

        //3 dimension array
        String [][][] menu1={ {{},{} },{{},{}}};

        /**
         * //Find sum of the int array with using WHILE loop
         *  // int[] a1 = new int[]{45, 12, 78, 34, 89, 21};
         */

        System.out.println("************************");

        int[] a1 = new int[]{45, 12, 78, 34, 89, 21};
        //                    0 ,1    2   3   4   5

        int sum=0; // we will use this variable to store answer;

        int sPoint=0;
        int ePoint=a1.length-1;

        while (sPoint <= ePoint){
            // 0 <= 5
            // 1<=5


          //  sum+=a1[sPoint];
            System.out.println(a1[sPoint]);

            sPoint++; // 0++,
        }

        System.out.println("sum = " + sum);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");

        //Options to create an array

        // Asssing value directly
        int []ls={1,2,3,5}; // I am assinging values directly

        // Update later
        int [] ls1=new int[2];
        ls[0]= 4;
        ls[1]=5;

        //
        int [] ls2=new int[]{2,3,4,5};

        System.out.println("******************************");


    //Move Zero to end of the Array

    //      int [] list1={4,5,6,0,-10,0,40};
   //Expected: {4,5,6,-10,40,0,0}

        int [] list1={4,5,5,0,-10,0,40};
        int [] ArrayToStoreAnswer=new int[list1.length]; // we will use this array to store answer;
        System.out.println(Arrays.toString(ArrayToStoreAnswer));//[0, 0, 0, 0, 0, 0, 0
        int temp=0;

        for (int i = 0; i <list1.length ; i++) { //i=0 ,i=1 , i=2 , i=3 , i=4 , i=5 , i=6

            if (list1[i] !=0){ // list1[0]= 4,  list1[1] =5 , list1[2]= 6; list1[3]=0 ,list1[4] =-10
                             //  list1[5] =0  , list1[6]=40
                ArrayToStoreAnswer[temp]=list1[i];
                //ArrayToStoreAnswer[0]= 4
                // ArrayToStoreAnswer[1]= 5
                //ArrayToStoreAnswer[2]=6;
                //ArrayToStoreAnswer[3]=-10
                //ArrayToStoreAnswer[4]=40
                temp++; // 0++, 1++, 2++, 3++

            }

        }
        System.out.println(Arrays.toString(ArrayToStoreAnswer));
        // [4, 5, 6, -10, 40, 0, 0]








    }


}
