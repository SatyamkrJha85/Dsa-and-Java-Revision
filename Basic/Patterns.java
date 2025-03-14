package Basic;

import java.util.Scanner;

public class Patterns {

    static void satyam(int number) {

        for (int i = 0; i < number; i++) { // this will print 7 row in increasing to decreasing format
            for (int j = 1; j < i; j++) { // this is responsible for printing star according to the current i values
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);
        // int x = scanner.nextInt();

        // Q1 ) Starting with simple pattern

        // **********
        // **********
        // **********
        // **********

        /*
         * for (int i = 0; i < 4; i++) { // this outer loop will print 4 rows
         * for (int j = 0; j < 10; j++) { // this inner loop will print 10 star in one
         * row
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * 
         */
        // Q2

        // ********
        // *******
        // *****
        // ***
        // **
        // *

        /*
         * for ( int i =7;i>0;i--){ // this will print 7 row in increasing to decreasing
         * format
         * for ( int j=0;j<i;j++){ // this is responsible for printing star according to
         * the current i values
         * System.out.print("*");
         * 
         * }
         * System.out.println();
         * 
         * }
         */

        // Q3

        // *
        // **
        // ***
        // ****
        // *****
        // ******

        /*
         * for ( int i =0;i<x;i++){ // this will print 7 row in increasing to decreasing
         * format
         * for ( int j=1;j<i;j++){ // this is responsible for printing star according to
         * the current i values
         * System.out.print(j);
         * }
         * System.out.println();
         * }
         * 
         */
        // Q4

        // 12
        // 123
        // 1234
        // 12345
        // 123456
        // 1234567

        // for (int i = 0; i < x; i++) { // this will print 7 row in increasing to decreasing format
        //     for (int j = 1; j < i; j++) { // this is responsible for printing star according to the current i values
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // 1.5 Pascal’s Triangle (Floyd’s Triangle)

        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10

        // int num = 1;
        // for (int i=1; i<=4; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(num);
        //         num++;
        //     }
        //     System.out.println();
        // }



        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4

        // for ( int i =0;i<=4;i++){
        //     for ( int j=0;j<=i;j++){
        //         System.out.print(i+"");
        //     }
        //     System.out.println();
        // }

    //      *     4 space 1 star 4 space
    //     ***    3 space 3 star 3 space 
    //    *****   2 space  5 star 2 space
    //   ******** 1 space  7 star 1 space

    // for ( int i =1;i<=4;i++){

    //     for( int j=0;j<4-i+1;j++){
    //         System.out.print(" ");

    //     }
    //     for(int k=0;k<2*i-1;k++){  
    //         System.out.print("*");
    //     }


    //     for( int l=1;l<=4-i+1;l++){
    //         System.out.print(" ");
    //     }
    //     System.out.println();
    // }


    // *****
    //  ***
    //   *



    // for (int i =0;i<4;i++){
    //     for(int j=0;j<i;j++){
    //         System.out.print(" ");
    //     }
    //     for (int k = 0; k < (2 * (4 - i) - 1); k++) {  // Prints stars 
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

//      *   
//     ***  
//    ***** 
//   *******
//    ***** 
//     ***  
//      *   
  
    //  for(int i =0;i<5;i++){
    //     for (int j=0;j<4-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=0;j<i*2-1;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //  }

    //  for(int i =0;i<4;i++){
    //     for (int j=0;j<i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=0;j<2*(4-i)-1;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //  }


//     Hourglass Pattern

// *******
//  ***** 
//   ***  
//    *   
//   ***  
//  ***** 
// *******


     for(int i =0;i<4;i++){
        for (int j=0;j<i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<2*(4-i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
     }
     for(int i =2;i<5;i++){
        for (int j=0;j<4-i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<i*2-1;j++){
            System.out.print("*");
        }
        System.out.println();
     }



    }
}
