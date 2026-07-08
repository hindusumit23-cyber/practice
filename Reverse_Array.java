public class Reverse_Array{
    public static int[] reverseArray(int arr[]){
        int arr[] = {1,2,3,4,5};
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
             int temp = arr[right];
             arr[right] = arr[left];
             arr[left] = temp;
            left++;
            right--;
        }
        return arr;
    }
}