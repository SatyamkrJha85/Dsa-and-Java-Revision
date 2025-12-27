package Fundamentals;

public class DiceProblem {

    public static void DiceNumber(int number ){

        if (number==1){

            System.out.println("6");
        }else if(number==2){
            System.out.println("5");

        }else if(number==3){
            System.out.println("4");

        }else if(number==4){
            System.out.println("3");

        }else if(number==5){
            System.out.println("2");

        }else{
           System.out.println("1");

        }
    }

    /*
    
    In a normal 6-faced dice, 1 is opposite to 6, 2 is opposite to 5, and 3 is opposite to 4. Hence a normal if-else-if block can be placed 
    */

    public static void main(String[] args) {
        DiceNumber (5);
    }
    
}
