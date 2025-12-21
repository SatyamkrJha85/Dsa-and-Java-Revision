package Fundamentals;

// Question Reverse a string Hello World -> dlroW olleH
public class ReverseString {

    public static void StringCharIs(String name){
        String ReverseCharIs = "";

        for ( int i = name.length()-1;i >=0; i--){
            ReverseCharIs=ReverseCharIs+name.charAt(i);
        }
        System.out.println("The reverse string is "+ReverseCharIs);
    }


    public static void main(String[] args) {
        StringCharIs("SatyamKrJha");
    }

}
