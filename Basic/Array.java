package Basic;

import java.util.Scanner;

public class Array {
    public static void main(String [] args) {


        // Basic Array Initializing

 /*        int [] name = new int[5];  // array size is 5 and current value is 0
        int number[] = {4,3,24,2,4}; // array size is 4 and value is assigned


        // Accessing the array elements one by one 

        System.out.println(number[2]); // it will return the third value of the number array
        System.out.println(name[2]); // it will return 0 because we not assign any valye yet
        
        // Assigning the value in name array

        name[0] = 342;
        name[2] = 34353;
        System.out.println(name[0]); // it will return 342
        System.out.println(name[2]); // it will return 34353
        System.out.println(name[3]); // it will return 0 because we not assign any valye yet

        // create an array with dynamic sizes and dynamic values

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();


        int [] numberarray = new int[x];

        System.out.println("the length of array is  : " +numberarray.length);

        System.out.println("Enter the value of in array  : " +x);
        for ( int i =0;i<x;i++){
            numberarray[i] = scanner.nextInt();
        }


        System.out.println("the value of an array is");
        for ( int i =0;i<x;i++){
            System.out.println( numberarray[i] );
        }
        scanner.close();
*/

       // 2 D array 

       int [] [] newarray = new int[3][3]; //  Initializing 2d array

       int [][] twoarray = {
        {7,8,8},
        {5,9,3},
        {7,4,2}
       };
       System.out.println("Printing 2d array elements");
       System.out.println(twoarray[1][2]);

       for(int i =0;i <twoarray.length;i++){
        for(int j=0; j<twoarray[i].length;j++){
            System.out.print(twoarray[i][j]+" ");
        }
        System.out.println();
       }

    }
}
