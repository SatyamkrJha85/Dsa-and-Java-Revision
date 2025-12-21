package Fundamentals;

public class SwapNumber {


    public static void Swap(int a , int b){

        int temp =a;
        a = b;
        b=temp;
        

        System.out.println("The a is "+a+" B is "+b );
    }

    public static void main(String[] args) {
        Swap(2,34);
    }
    
}
