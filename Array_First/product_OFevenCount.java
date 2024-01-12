package Array_First;

public class product_OFevenCount {
      static  int productOfEven(int arr[]){
          int n = arr.length ;
          int prod =1;
          int sum =0 ;
          for(int i=0 ; i<n;i++){
              if(i%2==0){
                  prod *=arr[i];
              }
              else{
                  sum +=arr[i];
              }
          }
          return prod ;
      }
    public static void main(String[] args) {
           int  arr[]={1,2,3,4,5,6};
           System.out.println(productOfEven(arr));

    }
}
