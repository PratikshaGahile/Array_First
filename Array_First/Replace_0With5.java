package Array_First;

public class Replace_0With5 {
    static  int[] replaceall(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=5;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr []={1,2,1,0,0,0,1};
                //{1,2,3,0,4,0,0,0,1};
        int result[]= replaceall(arr);

        for(int val : result){
            System.out.print(val+" ");
        }
    }
}
