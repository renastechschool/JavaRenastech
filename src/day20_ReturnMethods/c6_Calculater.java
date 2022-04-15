package day20_ReturnMethods;

public class c6_Calculater {

    // write a method that will take 3 parameters
    // 2 numbers and one operator
    // it will do the calculation

    //ex : 20 10 /
    //result 2

    //ex 30 3 *
    //result 90

    //  + - * / %


        public static void main(String[] args) {
            calculate(5,10,'+');
            calculate(5,5,'*');
            calculate(5,5,'/');
            calculate(5,5,'-');
            calculate(5,5,'%');
            calculate(5,5,'@');
            //calculate('-',5,5);

            System.out.println("calculate2(5,10,'+') = " + calculate2(5, 10, '+'));
            System.out.println("calculate2(5,5,'*') = " + calculate2(5, 5, '*'));
            System.out.println("calculate2(5,5,'/') = " + calculate2(5, 5, '/'));
            System.out.println("calculate2(5,5,'-') = " + calculate2(5, 5, '-'));
            System.out.println("calculate2(5,5,'%') = " + calculate2(5, 5, '%'));
            System.out.println("calculate2(5,5,'@') = " + calculate2(5, 5, '@'));
        }

        // write a method that will take 3 parameters
        // 2 numbers and one operator
        // it will do the calculation

        //ex : 20 10 /
        //result 2

        //ex 30 3 *
        //result 90

        public static void calculate(double number1 , double number2,char operator){
            //+ - * / %
            //invalid operators

            switch (operator){
                case '+' :
                    System.out.println(number1 + number2);
                    break;
                case '-':
                    System.out.println(number1-number2);
                    break;
                case '*':
                    System.out.println(number1*number2);
                    break;
                case '/':
                    System.out.println(number1/number2);
                    break;
                case '%':
                    System.out.println(number1%number2);
                    break;
                default:
                    System.out.println("Invalid Operator : "+ operator);
            }


        }

        public static double calculate2(double number1 , double number2,char operator) {
            //+ - * / %
            //invalid operators
            double result;

            switch (operator) {
                case '+':
                    result = (number1 + number2);
                    break;
                case '-':
                    result = (number1 - number2);
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    result = number1 / number2;
                    break;
                case '%':
                    result = number1 % number2;
                    break;
                default:
                    System.out.println("invalid entry");
                    result = 0;
            }

            return result;
        }


}
