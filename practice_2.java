

// 1.FizzBuzz — Print numbers from 1 to 50. For multiples of 3, print "Fizz"; for multiples of 5, print "Buzz"; for multiples of both 3 and 5, print "FizzBuzz"; otherwise print the number itself.


// public class practice_2{
//     public static void main( String[] args){
        
//        for(int i=1; i<=50; i++){
//         if( (i%3==0)&&(i%5==0) ) {
//             System.out.println("FizzBuzz");
//         }
//         else if (i%5==0) {
//             System.out.println("Buzz");
//         }
//         else if (i%3==0){
//             System.out.println("fizz");
//         }
//         else{
//             System.out.println(i);
        
//         }

//        }
        
//     }
// }



// 2.Star Pattern — Write a program to print a right-angled triangle pattern of stars (*) with 5 rows, where row i contains i stars.
// *
// **
// ***
// ****
// *****
// public class practice_2{
//     public static void main(String[] args) {
        
//        for(int i =1; i<=5;i++){
//          for(int j = 1 ; j<=i;j++){
//                 System.out.print(" * ");
        
//          }
//          System.out.println();
//        }

//     }
// }


// ...................................................................................................

// * * * * *
// * * * *
// * * *
// * *
// *

// public class practice_2{
//    public static void main(String[] args) {
       
//     for(int i=1; i<=5; i++){
//       for(int j=5; j>=i; j--){
//         System.out.print("*");
//       }
//       System.out.println("");
//     }
//    }
// }


// .....................................................................................................
//   *   
//  * *  
// * * * 
//  * * 
//   * 
// 


// public class practice_2{
//     public static void main(String[] args){
         
//       for(int i = 1; i<=3; i++){
//         for( int j = 1; j<= 3-i;j++){
        
//            System.out.print(" ");
//         }

//         for(int j =1 ;j <= 2*i-1;j++){ 
//            System.out.print("*");
//         }
        
    
//      System.out.println();    
//     }
//         for (int i = 2; i >= 1; i--) {
//             for (int j = 1; j <= 3 - i; j++) {
//                 System.out.print(" ");
//             }

//             for (int j = 1; j <= 2 * i - 1; j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }

//     }
// }


// public class practice_2{
//    public static void main(String[] args){

//           for(int i = 1;i<=4; i++){
//                for(int j = 1;j<=6;j++){
//                 if(i ==1|| j == 1 ||i == 4|| j == 6){
//                     System.out.print("*");
//                 }
//                 else {
//                 System.out.print(" ");}
//                }
//                System.out.println();
//           }

//    }}
         

// ******
// *    *
// *    *
// ******

// ................................................................................

//   *
//  * *
// *   *
//*******

public class practice_2{
   public static void main(String[] args){
           for(int i = 1 ; i<=3;i++){
             for(int j = 1 ; j<=3-i ; j++ ){
              System.out.print(" ");
              
             }
             System.out.print("*");
             for(int j=3;j<=3-i;j++){
              System.out.print("*");
             }
             for(int j=1;j<=2*i-3;j++){
              System.out.print(" ");

             }
             for(int j = 3;j<=i+1;j++){
                 System.out.print("*");
             }
             System.out.println();
           }
           
   }}


// 3.Prime Number Check — Write a program to check whether a given number is prime or not.
