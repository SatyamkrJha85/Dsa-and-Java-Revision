package Basic;

public class Sum {

    //  5 = 5+4+3+2+1

    public static void SumNumber(int n){
        int final_number = 0;
        for ( int i=1 ; i<=n;i++){
            final_number= final_number+i;
            
        }
        System.err.println("Number is "+final_number);

    }
    
    public static void main(String[] args) {
        SumNumber(5);
    }
}
