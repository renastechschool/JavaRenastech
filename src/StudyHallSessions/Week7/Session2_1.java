package StudyHallSessions.Week7;

public class Session2_1 {
    public static void main(String[] args) {
        // task 6. write a return method that can return the factorial number of any given number
        // Ex:
        //input: 6
        // output: 720


        /**
         * as a void method
         */
        factorical1(4); // 1 * 2 *3 *4== 24
        //factorail value of 4 = 24

        factorical1(6);
        //factorail value of 6 = 720


        /**
         * as a return method
         */

        factorailValue(4); // if I don't assign to a variable or print it won't print;

        int factorialValueFor4 = factorailValue(4); // I stored my method into a variable

        System.out.println("factorialValueFor4 = " + factorialValueFor4); //factorialValueFor4 = 24

        System.out.println(factorailValue(4)); //24

        int factorialValuefor6=factorailValue(6);

        System.out.println("factorialValuefor6 = " + factorialValuefor6);
        //factorialValuefor6 = 720


        //////    (Array) Find Maximum
        ////    Write a return method that can find the maximum number from a multi-dimension int Array
        ////
        //int [][] list2={{38,-90,0},{5,800,4}};

        int [][] list2={{38,-90,0},{5,800,4}};

        int maxValueInList2= maxValuein2D_Array(list2);

        System.out.println(maxValueInList2); //800

        int [][] list3={{38,36,0},{5,-90,4,90}};

        System.out.println(maxValuein2D_Array(list3));// 90

        int [] list4={3,4,6};

      //   System.out.println(maxValuein2D_Array(list4)); it will give error because given array is not 2 dimension.




    }
    public static int maxValuein2D_Array(int [][] given2dArray){

        int max=given2dArray[0][0]; // asssume that this index is my max number

        for (int i = 0; i <given2dArray.length ; i++) {

            for (int j = 0; j <given2dArray[i].length ; j++) {

                if (given2dArray[i][j] >max){

                    max=given2dArray[i][j];
                }

            }

        }

     return max;
    }

    public static void factorical1(int number){ // 3 >> 1*2*3;

        int answer=1; // we will use this variable to store answer;

        for (int i = 1; i <=number ; i++) {

            answer*=i; // updated my answer

        }

        System.out.println("factorail value of "+number +" = " +answer);

    }

    public static int factorailValue(int number){

        int answer=1;

        for (int i = 1; i <=number ; i++) {
            answer= answer *i;
        }

        return answer;

    }
}
