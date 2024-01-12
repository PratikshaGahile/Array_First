package Array_First;

import java.util.Arrays;

public class Move_Zero_to_Left {
    static  int [] moveZerors (int arr[]){
        int k=arr.length;
        int res []= new int [k];
        int idx =0;
        int l=k-1;
        for(int i =0;i<k;i++){
            if(arr[i]==0) {
                res[l] = arr[i];
                l--;
            }
            else{
                res[idx]=arr[i];
                idx++;
            }
        }
        return res ;
    }
    static  int [] secondWay(int nums []){
        int len = nums.length;
        int count =0;
        for(int  i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count++]=nums[i];
            }

        }
        while (count<len){
            nums[count ++]=0;
        }
        return nums;
    }

    public static void main(String[] args) {
        int arr1 []= {0,1,0,3,12,0,4,5,6,0,12,7};
        System.out.println(Arrays.toString(moveZerors(arr1)));
        System.out.println(Arrays.toString((secondWay(arr1))));

    }
}
