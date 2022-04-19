package day22_List;

public class c4_ValueOfMethod {

    ////            valueOf methods: converting string to wrapper class value, returns wrapper class values

    public static void main(String[] args) {
        String str="55";

        Integer number=Integer.valueOf(str);
        int number2=Integer.parseInt(str);

        System.out.println(number+5);
        System.out.println(number2+5);
        System.out.println(str + 25); // text 5525

        String str2="55.25";

        Double d1=Double.valueOf(str2);
        System.out.println(d1+10);

    }
}
