// Input:  "A man a plan a canal Panama"
// Output: Palindrome ✅

import java.util.Scanner;

public class practice_4{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the line : ");
          String input = sc.nextLine();

          String lower = input.toLowerCase();
          String clean = lower.replaceAll(" ", "");
          System.out.println(clean); 
          for(int i=0; i<clean.length(); i++){
                 System.out.println(clean.charAt(i));
          } 
          String rev = new StringBuilder(clean).reverse().toString();
           for(int i=0; i<rev.length(); i++){
                 System.out.println(rev.charAt(i));
          } 
          if(clean.equals(rev)){
            System.out.println("Yes, it is Palindrome");}
          else{
            System.out.println("Not Palindrome");
          }
          }

    }
