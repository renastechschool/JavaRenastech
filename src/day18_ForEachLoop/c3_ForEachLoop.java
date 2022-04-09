package day18_ForEachLoop;

public class c3_ForEachLoop {

    public static void main(String[] args) {
        //loop types
            //for loop
            //while loop
            //do while loop
            //for each loop


        int [] numbers={1,2,3,4,5,6};

        for (int eachNumber : numbers ) {
            //for each loop will store each variable from the numbers list
            //in each iteration from first one to last one
            System.out.println(eachNumber);

        }

        String [] initials={"GT","LA" , "O" ,"HK", "EG" , "ACP" , "G"};
        //print all initials using for each

        for (String letter : initials){
            System.out.print(letter + " ");
        }
        System.out.println(); // to break line

        String sentence="HEllo world java is here" ;
        String [] words=sentence.split(" ");

        for (String word : words){
            System.out.println(word);
        }



    }
}
