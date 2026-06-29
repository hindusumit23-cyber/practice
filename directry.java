// 1. Student Directory

// Store 10 students in ArrayList (name, marks)
// Find duplicate names using HashSet


import java.util.ArrayList;
import java.util.HashSet;
public class directry {
    public static void main( String[] args){

       ArrayList<String> names = new ArrayList<>();
       names.add(0,"Sumit");
       names.add(1,"amit");
       names.add(2,"hit");
       names.add(3,"mit");
       names.add(4,"Sit");
       names.add(5,"errUmit");
       names.add(6,"SUmt");
       names.add(7,"Sit");
       names.add(8,"yuUmit");
       names.add(9,"Sumit");

       System.out.println(names);

    HashSet<String> unique = new HashSet<>();
         for(String name :names){
            if(!unique.add(name)){
                System.out.println(name);
            }
         }
    }
}