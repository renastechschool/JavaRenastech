package day07_switch_scanner;

public class c2_SwitchStatements {

    //create a java program that will take numbers between 1-12
    //and print months name depends on number
    //ex
    //1 -- jan
    //5 -- may
    public static void main(String[] args) {
        int number=4;
        String monthName;

        switch (number){ // switch will ask you to pass a variable that will be compared with cases
            case 1 : monthName ="Jan" ; // switch will check number and if it matches with case =1
                //it will make monthname as a Jan
                break;//break will break all switch after cathing the matching case
            case 2 : monthName ="Feb";
                break;
            case 3 : monthName ="March";
                break;
            case 7 : monthName ="July" ;
                break;
            case 4 : monthName ="Apr";
                break;
            case 5 : monthName ="May" ;
                break;
            case 6 : monthName ="Jun" ;
                break;
            case 8 : monthName ="Aug" ;
                break;
            case 9 : monthName ="Sep" ;
                break;
            case 10 : monthName ="Oct" ;
                break;
            case 11 : monthName ="Nov" ;
                break;
            case 12 : monthName ="Dec" ;
                break;
            default: monthName = " invalid number entered please check your number !!!!";

        }

        System.out.println(monthName);



    }
}
