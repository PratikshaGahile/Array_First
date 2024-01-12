package Array_First;

public class Search_Element {
     static int search(int arr[] ,int key ){
         int n=arr.length;
         for(int i=0;i<n-1;i++){
             if(key==arr[i]){
                 return i;
             }
         }
         return -1;
     }
    public static void main(String[] args) {
         int arr[]={10,20,30,40,50};
         //int key =33;
        int key =30;
        System.out.println(search(arr,key));


        System.out.println();

    }
}
