package Array_First;

public class Element_inRange {
    static boolean isElementinRange(int arr[],int a,int b){

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=a || arr[i]<=b ){
                return true;
            }

        }


        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,2,7,8,3};
        int a=2,b=0;
        System.out.println(isElementinRange(arr,a,b));


    }
}
