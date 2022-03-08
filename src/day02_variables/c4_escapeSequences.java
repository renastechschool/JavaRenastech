package day02_variables;

public class c4_escapeSequences {

    /*
        escape sequences:
     \t   It is going to leave paragraph space on the console
	 \n   It is going to move on new line on the console
	 \"   prints double quote " on the console
	 \\   prints \ on the console
	 \'   prints single quote on the console
     '    prints single quote on the console

     */

    public static void main(String[] args){

        System.out.println("Renastech");

        //   \t: paragraph space
        System.out.println("\tRenastech");
        System.out.println("      Renastech");
        System.out.println("\t\t\t\t\tRenastech");

        //	 \n: new line
        System.out.println("Hello World");
        System.out.println("Hello \nWorld");
        System.out.println("Hello \n\tWorld \tJava");

        //	 \\: prints \ on the console
        System.out.println("\\\\");
        System.out.println("//");

        //	 \": prints double quote " on the console
        System.out.println("Today is \"Tuesday\" . ");


        //	 \': prints single quote
        //   ' : prints single quote
        System.out.println("Today is \'Friday\' .");
        System.out.println("Today is 'Friday' .");


    }
}
