package part3.task1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] ar = new int[10];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random() * 200) - 100;
        }
//        System.out.println(Arrays.toString(ar));

        int maxNum = ar[0],
                indexMax = 0;

        int minNum = ar[0],
                indexMin = 0;

        for (int i = 0; i < ar.length; i++) {
            if (maxNum < ar[i]) {
                maxNum = ar[i];
                indexMax = i;
            }
        }

        for (int i = 0; i < ar.length; i++) {
            if (minNum > ar[i]) {
                minNum = ar[i];
                indexMin = i;
            }
        }

        System.out.println("Maximum number " + maxNum + ", indexMax=" + indexMax);
        System.out.println("Minimum number " + minNum + ", indexMin=" + indexMin);


    }
}
