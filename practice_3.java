//  square of a number

import java.util.Scanner;

public class practice_3{
    
    static void  square() {
        System.out.println("Enter the Number:");
         Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
        int s = num*num;
        System.out.println("Square is : " + s );
    }
    public static void main(String[] args){
         square();
    }
}