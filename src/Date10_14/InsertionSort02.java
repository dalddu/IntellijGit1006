package Date10_14;

import java.util.Arrays;

public class InsertionSort02 {
    //재귀(recursive) -- 반복문(while)없이 반복해야 할 때
    public int[] sort(int[] arr) {
        // i=1 arr[1] vs arr[0]
        // i=2 arr[2] vs arr[1]
        // i=2 arr[1] vs arr[0]
        for(int i=1; i<arr.length-1; i++) {
            for(int j=i; j>0; j--) {
            if (arr[j] < arr[j - 1]) { // arr[1] vs arr[0]
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                /*
                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1) // 재귀
                 */
            }
        }
        return arr;
        // return sort(arr, i+1) 재귀는  자기자신을 빼고 돌려야함
    }

    public static void main(String[] args) {
        // 5에서 출발을 합니다  idx = 1
        int[] arr = {8, 5, 6, 2, 4};
        InsertionSort02 is = new InsertionSort02();
        arr = new int[] {5, 8, 6, 2, 4};
        int[] result = is.sort(arr);

        System.out.println(Arrays.toString(result));
        }
    }
}
