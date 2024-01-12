package Array_First;

import java.util.Arrays;

public class AverageOfArray {
    static  int average(int arr[]){
        int avg;
        int n= arr.length ;
        int sum =0;
        for(int i=0;i<n;i++){
            sum+= arr[i];

        }
        avg = sum/n;
        return avg ;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(average(arr));

    }
}
