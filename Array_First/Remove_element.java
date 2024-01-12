package Array_First;

import java.util.Arrays;

public class Remove_element {
    static  int[] remove(int arr[] ,int removeindex){
        int ans[]=new int[arr.length];
        int n=0;
        for(int i=0;i<arr.length;i++){
            if(i!=removeindex){
                ans[n]=arr[i];
                n++;
            }
        }

        return ans;
    }
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6};
        System.out.println(Arrays.toString(remove(arr,3)));

    }
}
