package day08_scanner_String;

public class c1_switchPractice {
    //Duplicate case values are not allowed.
    //The value for a case must be of the same data type as the variable in the switch. (or smaller then switch range)
    //The value for a case must be a constant or a literal. Variables are not allowed.
    //The break statement is used inside the switch to terminate a statement sequence.
    //The break statement is optional. If omitted, execution will continue on into the next case.
    //The default statement is optional and can appear anywhere inside the switch block.
    //          In case, if it is not at the end, then a break statement must be kept after the
    //          default statement to avoid the execution of the next case statement.

    //Accepted Data Types
    //The variable passed as a switch argument can be one of the following:
    //char
    //byte
    //short
    //int
    //String
    //Integer,Short,Byte,Character

    public static void main(String[] args) {
        //create an logic that will check the number and print the day name

        byte b1=1;
        short s1=2;
        int number=7;
        long l1=2;
        float f1=4;
        double d1=10;

        String dayName;

        switch (number){
            case 1:
                dayName="mon";
                break;
            case 2:
                dayName="tue";
                break;
            case 3:
                dayName="wed";
                break;
            case 4:
                dayName="thu";
                break;
            case 5:
                dayName="fri";
                break;
            case 6:
                dayName="Sat";
                break;
            case 7:
                dayName="sun";
                break;
            default:
                dayName ="invalid";

        }


    }

}
