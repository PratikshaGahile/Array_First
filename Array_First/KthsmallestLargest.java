package Array_First;
import java.util.Arrays;

public class KthsmallestLargest {

    static  int  smallest_largest(int arr[],int k){
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr.length;j++){
               if(arr[i]<arr[j]){
                   int temp = arr[i];
                   arr[i]= arr[j];
                   arr[j]=temp;
               }
           }
        }
        return arr[k-1];
    }

    public static void main(String[] args) {
        int arr []={12, 3, 5, 7, 19};
        int k =3 ;
        System.out.println(smallest_largest(arr,k));

    }


}
