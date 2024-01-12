package Array_First;

public class Revrese_array {
    static void reversearray(int arr[]){
        int start = 0 ;
        int end = arr.length-1;

        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int val : arr){
            System.out.print(val +" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};

        reversearray(arr);
    }
}
