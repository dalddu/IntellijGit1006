package Date10_14;

import java.util.Arrays;

public class InsertionSort03 {
    //재귀(recursive) -- 반복문(while)없이 반복해야 할 때
    public int[] sort(int[] arr, int i) {
        // i=1 arr[1] vs arr[0]
        // i=2 arr[2] vs arr[1]
        // i=2 arr[1] vs arr[0]
        if(i==arr.length) return arr;

            for (int j = i; j > 0; j--) {
                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1); // 재귀
                }

        return sort(arr, i+1);
    }

    public static void main(String[] args) {
        // 5에서 출발을 합니다  idx = 1
        int[] arr = {8, 5, 6, 2, 4};
        InsertionSort03 is = new InsertionSort03();
        arr = new int[] {5, 8, 6, 2, 4};
        int[] result = is.sort(arr, 1);

        System.out.println(Arrays.toString(result));
        }
    }

