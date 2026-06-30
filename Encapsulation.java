import java.util.Scanner;
public class Encapsulation {

     private String client;
     private int phone;
     private String name;
     private int price;
  
  
       public void setClient(String client ){
          this.client = client;
       }
       public void setPhone(int phone){
          this.phone = phone;
       }
        public void setName( String name){
             this.name = name;
        }
        public void setPrice(int price){
             this.price = price;
        }
        public String getClient(){
             return client;
        }
        public int getPhone(){
             return phone;
        }
        public String getName(){
             return name;
        }
        public int getPrice(){
             return price;
        }
        
   
   
    public static void main(String[] args) {
       Encapsulation s1 = new Encapsulation();
         s1.setClient("Sumit");
         s1.setPhone(1234567890);
         s1.setName("Chair");
         s1.setPrice(200);
      
      System.out.println(" -------------------------------------------------");
         System.out.println(" Customer Details");
       System.out.println(" Client Name: " + s1.getClient());
       System.out.println(" Client Phone: " + s1.getPhone());
       System.out.println(" -------------------------------------------------");
       System.out.println(" Item Details");
       System.out.println(" Item Name: " + s1.getName());
         System.out.println(" Item Price: " + s1.getPrice());
          

        }
    }
