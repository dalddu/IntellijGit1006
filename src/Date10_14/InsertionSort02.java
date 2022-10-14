package Date10_14;

import java.util.Arrays;

public class InsertionSort02 {
    // 루프 i를 적용
    public int[] sort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) { // arr[1] vs arr[0]
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
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
