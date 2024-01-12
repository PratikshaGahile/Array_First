package Array_First;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class EvenOccuring {
    static  void evenoccuring(int arr[])
    {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean isUnique = true;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    count++;
                    if (count % 2 != 0) {
                        isUnique = false;
                        break;
                    }
                }
            }

            if (isUnique && count % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={9,12,23,10,12,12,15,12,15};
        //System.out.println( Arrays.toString(evenoccuring(arr)));
        evenoccuring(arr);
    }
}
