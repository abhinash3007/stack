package STACK;

import java.util.ArrayList;

public class MaxOfMinWindowSize {
    public static void maximum(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= arr.length - k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j <i+k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }  list.add(max);
        }System.out.println(list);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)<min){
                min=list.get(i);
            }
        }System.out.println(min);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        maximum(arr, 3);
    }
}
