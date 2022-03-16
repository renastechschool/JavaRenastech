package StudyHallSessions.Week3;

public class Session2_2 {
    public static void main(String[] args) {
        /**
         *  /**
         *          * Jane wants to build a very simple tip calculator for whenever he goes eating in a restaurant.
         *          * In his country, it's usual to tip 15% if the bill value is between 99 and 280.
         *          * If the value is different, the tip is 20%.
         *          */

        //variables
        double bill=300;
        double tipAmount=0;
        double totalBill=0;


        if (bill>=99 && bill <=280 ){
 //        true && false
            tipAmount = bill* 0.15;
            System.out.println("bill = " + bill);
            System.out.println("tipAmount = " + tipAmount);
            totalBill=tipAmount+bill;
            System.out.println("Total Bill= "+totalBill);

        }else {
            tipAmount = bill* 0.20;
            //        = 25 * 0.20 = 5

            totalBill=bill+tipAmount;
            System.out.println("bill = " + bill);
            System.out.println("tipAmount = " + tipAmount);
            System.out.println("totalBill = " + totalBill);


        }

    }
}
