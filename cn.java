// nums = [1,2,1]
// Output: [1,2,1,1,2,1]
import java.util.Arrays;
public class cn{
    public static void main(String[] args){
         int arr[] = {1,2,1};
         int ans[] = new int[ 2*arr.length] ;
         for(int i = 0; i<arr.length; i++){
            ans[i] = arr[i];
            ans[i + arr.length] = arr[i] ; 
         }
         System.out.println(Arrays.toString(ans));
    }
}