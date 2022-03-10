package day05_ifStatements;

public class c7_multiIfStatement {

    public static void main(String [] args){
        //check 2 numbers
        //first check if they are equal
        //second check is one of them bigger
        //last condition is smaller

        //you will prefer to use multi if if you have more then 2 conditions

        int x=25;
        int y=15;

        if (x==y){//java will first check this block
            System.out.println(x + " equal to "+y);
        }else if (x>y){//it will check this as next
            System.out.println(x + " is bigger then " + y);
        }else {//if all previus if are not true then it will print the else
            System.out.println(x + " is smaller then " + y);
        }


    }


}
