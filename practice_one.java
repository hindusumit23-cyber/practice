// 1 .Write a Java program that takes input for a person's age (int), height (double), first initial (char), student status (boolean), and full name (String) using Scanner, then display all the details.
// import java.util.Scanner;





//  public class practice_one{
//     public static void main(String[] args){

//             Scanner sc = new Scanner(System.in);
//         System.out.println("Enter age:");
//             int age = sc.nextInt();

//         System.out.println("Enter height:");
//             double height = sc.nextDouble();

//         System.out.println("Enter first character:");
//              char initial = sc.next().charAt(0);

//         System.out.println("Enter married(true/false):");
//               boolean status = sc.nextBoolean();
//         sc.nextLine();
//         System.out.println("Enter name:");
//               String name = sc.nextLine();
     
//          System.out.printf("Student Name is %s and his age is %d . %n  height of %s is  %f%n THe Character is %c  Married Status is %b%n " , name,age,name,height,initial,status);
//     }
//  }






// 2. Simple Calculator — Write a Java program that takes two numbers and an operator (+, -, *, /) as input, performs the corresponding arithmetic operation, and displays the result (handle division by zero and invalid operators).
//    import java.util.Scanner;








//    public class practice_one{
//     public static void main(String[] args){{

//         Scanner sc = new Scanner(System.in);

//          System.out.println("Enter First number:");
//               double a = sc.nextDouble();
         
//          System.out.println("Enter Second number:");
//               double b = sc.nextDouble();
            
//           System.out.println("Addition gives:" + (a+b) );
//           System.out.println("Substraction gives:" + (a-b) );
//           System.out.println("Multiplication gives:" + (a*b) );
//           System.out.println("Division gives:" + (a/b) );


//     }}
// }







// 3. Type Casting Demo — Write a Java program that demonstrates implicit casting (int to double) and explicit casting (double to int, int to char, and int to byte), taking the values as user input.








// import java.util.Scanner;

// public class practice_one{
//     public static void main(String[] args) {
//         System.out.print("Enter a number :  ");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
        
//         double decnum = (double) num;

//         System.out.println("After conv n-d : " + decnum);
//         int num2 =(int) decnum; 
//         System.out.println("After conv d-n : " + num2);
//         char c = (char) num;
//         System.out.println("After conv n-d : " + c);
//         byte b = (byte) num;
//         System.out.println("After conv n-d : " + b);


//     }
// }



// 4 . Swaping Two Numbers

// public class practice_one{
//     public static void main (String [] args){
//         int a = 5;
//         int b = 7;
//         System.out.println("Before Swap : "+a + " " +b);
        
//         a = a*b ;
//         b = a/b ;
//         a = a/b ;

//         System.out.println("After Swap : "+a + " " +b);
        
//     }
// }

// 5. Sum of digits 

public class practice_one{
    public static void main(String[] args) {
        int a = 4586 ;
        int rev = 0;
    while(a != 0){
        rev = rev + a%10 ;
        a = a/10 ;
        
    }

    System.out.println(rev);


    }
}
