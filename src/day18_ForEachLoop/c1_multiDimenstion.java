package day18_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class c1_multiDimenstion {

    public static void main(String[] args) {

        String [][] nameList= {  { "boy1" , "boy2", "boy3"}  , { "girl1" , "girl2" , "girl3" , "girl4"}    };
                            //    0                          ,  1
                            //       0       1       2              0         1        2         3

        //arr [][]
        //first bracket is always container number
        //second one is index of variable
        String girl3=nameList[1][2];
        String boy2=nameList[0][1];

        //store boy names
        String [] boyNames=nameList[0];
        String [] girlNames=nameList[1];

        System.out.println("girl3 = " + girl3);

        System.out.println(Arrays.toString(boyNames));


        //        int [][][] number3d= {
//                { {1,2,3} , {4,5} } ,
//                { {6 } , {7} }  ,
//                { {8} }
//        };

        int [][][] number3d= {        { {1,2,3},{4,5} } , { {6} ,{7}} , { {8} }  };
        //child container index       0                   1             2
        //grandchild container index     0       1          0    1         0
        //data index                     0 1 2 , 0 1        0    0         0


        System.out.println(number3d[0][0][0]);//1
        System.out.println(number3d[0][1][0]);//4
        System.out.println(number3d[2][0][0]);//8
        System.out.println(number3d[1][1][0]);//7
        System.out.println(number3d[0][1][1]);







    }


}
