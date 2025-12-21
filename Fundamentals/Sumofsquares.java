package Fundamentals;

public class Sumofsquares {
    
    /*
    
    Given a positive integer n, we have to find the sum of squares of first n natural numbers. 
Examples : 

Input : n = 2
Output: 5
Explanation: 1^2+2^2 = 5

Input : n = 8
Output: 204
Explanation :  1^2 + 2^2 + 3^2 + 4^2 + 5^2 + 6^2 + 7^2 + 8^2 = 204 
    */



public static void SumSquareNumber(int number){
    int sum =0;
    int square=0;
    
    for ( int i=0;i<=number;i++){

        square=i*i;
        sum=sum+square;
    }

    System.out.println("The Sum of square is "+sum);

}


public static void main(String[] args) {
    SumSquareNumber(8);
}


    
}
