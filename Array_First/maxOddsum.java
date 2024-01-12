package Array_First;

public class maxOddsum {
    static int maxodd(int arr[]){
        int maxsum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] %2 !=0){
                maxsum +=arr[i];
            }
        }
        return maxsum;

    }
    public static void main(String[] args) {
        int arr[]= {4,-3,3,-5};
        System.out.println(maxodd(arr));
    }
}
