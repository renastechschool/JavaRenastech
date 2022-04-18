package day21_MethodOverloading;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class c8_dateFormats {

    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter1=DateTimeFormatter.ofPattern("dd/MMM/yyyy");

        LocalDate localDate1=LocalDate.now();
        System.out.println("localDate1 = " + localDate1);
        System.out.println(localDate1.format(dateTimeFormatter1));//27/Sep/2021

        DateTimeFormatter dateTimeFormatter2=DateTimeFormatter.ofPattern("E MMMM/dd/yy");//Mon September/27/21
        System.out.println(localDate1.format(dateTimeFormatter2));

        //E : day of name
        //MMM jan MMMM january
        //yy :21 yyyy:2021

        //to print time as well we will need to use LocalDataTime instead of LocalData
        LocalDateTime localDateTime1=LocalDateTime.of(2012,9,15,7,25,35);
        LocalDateTime localDateTime2=LocalDateTime.of(2012,9,15,15,25,35);
        System.out.println("localDateTime1 = " + localDateTime1);
        System.out.println("localDateTime2 = " + localDateTime2);

        DateTimeFormatter dateTimeFormatter3=DateTimeFormatter.ofPattern("EEE, MM/dd hh:mm a");
        System.out.println(localDateTime2.format(dateTimeFormatter3));


    }
}
