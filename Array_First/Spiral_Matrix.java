package Array_First;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spiral_Matrix {
    static List<Integer>  pritnSpiral(int arr[][]){
         List<Integer> ans = new ArrayList<Integer>();
         int n = arr.length ;
         int m= arr[0].length;

         int top=0;
         int bottom =n-1;
         int right= m-1;
         int left=0;

         while(top<= bottom && left <=right){
             // it consist the  4 loo[p for moving to the  left to right to bottom to left to to
             //for moving the left to right
             for(int i=left ;i<=right;i++){
                 ans.add(arr[top][i]);
             }
             top++;

             //for moving to the top to bottom
             for(int i=top; i<=bottom;i++) {
                 ans.add(arr[i][right]);
             }
             right--;

             //for mob=ving tto the left to right

             if(top<=bottom){
                 for(int i=right;i>=left;i--){
                     ans.add(arr[bottom][i]);
                 }
                 bottom--;
             }

             //for printtin the bottom to the top
             if(left<=right){
                 for(int i=bottom;i>=top;i--){
                     ans.add(arr[i][left]);
                 }
                 left++;
             }
         }
         return  ans;
    }

    static void  transposeOfMAtrix(int matrix [][]){
        int n= matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for( int i=0;i<n++;i++){
            for(int  j=0;j<m;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(pritnSpiral(arr));
        //transposeOfMAtrix(arr);
        //System.out.println(Arrays .toString(transposeOfMAtrix(arr)));
        //1 2 3
        //4 5 6
        //7 8 9
    }
}
