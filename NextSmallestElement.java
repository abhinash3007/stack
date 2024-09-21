package STACK;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallestElement {
    public static void approach2(int[]arr){
        Stack<Integer>s=new Stack<>();
        int nge[]=new int[arr.length];
         Arrays.fill(nge, -1);
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[i]<arr[s.peek()]) {
                nge[s.peek()]= arr[i];
                s.pop();
            } if (s.isEmpty()) {
                nge[i] = -1;
            }
            s.push(i);
        }for (int element : nge) {
            System.out.print(element + " ");
        }
    }public static void main(String[] args) {
        int[]arr={7,9,12,10,14,8,3,6,9};
        approach2(arr);
    }
}
