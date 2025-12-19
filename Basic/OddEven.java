package Basic;

public class OddEven {


    public static boolean isEven(int n){
        int rem = n % 2;
        if (rem == 0){

            return true;
        }else{
            return false;
        }
    }

     // Driver Code
    public static void main(String[] args)
    {
        int n = 14;
        if (isEven(n) == true)
            System.out.print("true");
        else
            System.out.print("false");
    }
    
}
