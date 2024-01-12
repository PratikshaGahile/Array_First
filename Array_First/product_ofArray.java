package Array_First;

public class product_ofArray {
    static int product(int arr[]){
        int prod=1;
        for(int i=0;i<arr.length;i++){
         prod*=arr[i];
        }
        return prod;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(product(arr));
    }
}
