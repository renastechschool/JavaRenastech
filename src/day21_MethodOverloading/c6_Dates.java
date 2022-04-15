package day21_MethodOverloading;


import java.time.LocalDate;

public class c6_Dates {

    public static void main(String[] args) {

        //LocalDate class is coming from java library
        LocalDate obj1=LocalDate.of(2022,03,27);
        //we create objects from classes

        System.out.println(obj1);

        LocalDate localDate2=LocalDate.of(2021,07,06);
        System.out.println("localDate2 = " + localDate2);

        boolean b1=localDate2.isAfter(obj1); //false
        boolean b2=localDate2.isBefore(obj1); //true
        boolean b3=localDate2.isEqual(obj1); //false

        System.out.println(b1 + " / " + b2 + " / " + b3);

        //today date
        LocalDate todayDate=LocalDate.now();
        System.out.println(todayDate);

        String todayDateString =todayDate.toString();
        todayDateString = todayDateString.replace("-",".");

        System.out.println("todayDateString = " + todayDateString);

    }


}
