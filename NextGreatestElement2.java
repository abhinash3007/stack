package STACK;

import java.util.Arrays;
import java.util.Stack;

public class NextGreatestElement2 {
    public static void gratest2(int[]arr){
        Stack<Integer>s=new Stack<>();
        int ele[]=new int[arr.length];
         Arrays.fill(ele, -1);
        for (int i = 0; i < 2*ele.length-1; i++) {
            while (!s.isEmpty() && arr[s.peek()]<arr[i%arr.length]) {
                ele[s.peek()]=arr[i%arr.length];
                s.pop();
            }if (s.isEmpty()) {
                ele[i] = -1;
            }if(i<arr.length){
                s.push(i);
            }
        }for (int element : ele) {
            System.out.print(element + " ");
        }
    }public static void main(String[] args) {
        int[]arr={6,10,7,4,8,9,4};
        gratest2(arr);
    }
}
