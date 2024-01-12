
package Array_First;
public class Min_Max {
    static  void min_max(int arr[]){
        int max = arr[0];
        int min=arr[0];
        int n=arr.length;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Min : "+min +" \n"+"Max : "+max);
    }

    public static void main(String[] args) {
        //int arr[]={3,2,1,56,1000,167};
        int arr[]={1,345,234,21,56789};
        min_max(arr);
    }
}
