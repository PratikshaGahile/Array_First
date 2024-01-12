package Array_First;

public class Squareroot {
    static  int sqrt(int n){
        int start = 1 ;
        int end = n;
        int ans =0 ;
        while (start <=end ){
            int mid = start + (end-start )/2;
            int square = mid*mid;
            if(square == n){
                return mid;
            }
            else if(square <n){
                start=mid+1;
                ans =mid ;
            }
            else{
                end= mid -1;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        int x=49;
        System.out.println(sqrt(x));

    }
}
