package Array_First;

public class Largest_element {

    static  int largest (int arr[]){
        int n = arr.length;
        int max=Integer.MIN_VALUE;
        for(int i =0 ;i<n;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,8,7,56,90};
                //{1,2,0,3,2,4,5};
        System.out.println(largest(arr));
    }

}
