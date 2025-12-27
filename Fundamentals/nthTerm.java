package Fundamentals;

public class nthTerm {

   public static void FindTerm(int a1,int a2,int n){


     int d = a2 - a1;                 // common difference
     int term = a1 + (n - 1) * d;     // nth term formula

     System.out.println("Nth term is: " + term);
    }

    public static void main(String[] args) {
        FindTerm(2, 3, 4);
    }
    
}
