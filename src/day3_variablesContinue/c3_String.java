package day3_variablesContinue;

public class c3_String {
    //string is non primitive data type

    public static void main(String [] args){

        //datatype variablename=data;

        String nameOfStudent="Halil"; // text
        String schoolName="Renastech"; //text

        //id for ozgur
        //since id is a number its better to use whole numbers
        int id=124234; //will be number
        //String id2 ="124234"; //output will be text

        System.out.println(nameOfStudent);
        System.out.println("Name of Student : " + nameOfStudent + " ,Student id : " + id);

        //if you want to print in different lines
        System.out.println("Name is : " + nameOfStudent + "\nSchool Name : "+schoolName);


        String number1="100";
        byte number2=100;

        System.out.println(number1+10);//text + number == (since we have string inside it will concat)10010
        System.out.println(number2+10);//number + number ==since both is number 110

    }
}
