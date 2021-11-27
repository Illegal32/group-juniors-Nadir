package az.iktlab.juniors.lessons.lesson_5;

import java.util.Arrays;

public class MultiDMNSArr {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {}, {2, 5, 6, 9}, {1}};
//        System.out.println(arr[1][0]);

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}