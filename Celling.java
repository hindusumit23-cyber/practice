// Celling of number
public class Celling{
    public static void main(String[] args){
        int arr[] = {2,4,6,7,8,10,12};
       int target = 5;
       int low = 0;
       int up = arr.length - 1;
       while(low <= up){
          int mid = (low + up)/2;
        if(arr[mid] == target){
              System.out.println(mid);
              break;
        }
        else if(arr[mid]<= target){
            low = mid + 1;
        }
        else{
            up = mid -1;
            
        }
       }
             System.out.println(low);      
    }
}