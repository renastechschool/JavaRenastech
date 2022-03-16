package StudyHallSessions.Week3;

public class Session2 {

    public static void main(String[] args) {
        /**
         * *Write A Program To Calculate The Monthly Telephone Bills As Per The Following Rule:
         *          * Minimum Rs. 200 For Upto 100 Calls.
         *          * Plus Rs. 0.60 Per Call For Next 50 Calls.
         *          * Plus Rs. 0.50 Per Call For Next 50 Calls.
         *          * Plus Rs. 0.40 Per Call For Any Call Beyond 200 Calls.
         *          */

        // Variables
        double bill=0;
        double callCount=450;

        //Minimum Rs. 200 For Upto 100 Calls.
        if (callCount<=100){
            bill=200;
            System.out.println("Call Count="+ callCount);
            System.out.println("bill = " + bill);

            //Plus Rs. 0.60 Per Call For Next 50 Calls.
        }else if(callCount>100 && callCount<=150){
            // firstt 100 call will =200
            // 130-100= 30
            // 30 * 0.60 = 18;  total 218;

            bill= 200 +((callCount - 100)*0.60);
            System.out.println("Call Count = "+callCount);
            System.out.println("Bill = "+bill);

        //* Plus Rs. 0.50 Per Call For Next 50 Calls.
        }else if (callCount> 150 && callCount<=200){
            bill =200 +(50* 0.60) + ((callCount -150)* 0.50);

            System.out.println("Call count = "+callCount);
            System.out.println("bill = " + bill);

            //Plus Rs. 0.40 Per Call For Any Call Beyond 200 Calls.

        }else {
            bill= 200+ (50 *0.60)+ (50*0.50)+ ((callCount-200) *0.40 );
            System.out.println("Call Count = "+ callCount);
            System.out.println("Bill = "+bill);

        }





    }
}
