package Date10_13;

import java.util.Arrays;

public class Bubblesort {

    public int[] sort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        //오름 차순 또는 내림차순으로 정렬하는 알고리즘을 짜보세요
        Bubblesort bs = new Bubblesort();
        int[] result = bs.sort(arr);
        System.out.println(Arrays.toString(result));
        }

    }

