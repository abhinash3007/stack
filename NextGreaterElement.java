package STACK;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void greater(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            boolean found=false;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]>curr){
                    System.out.println(arr[j]);
                    found=true;
                    break;
                }
            }if(!found){
                System.out.println(-1);
            }
        }
    }public static void approach2(int[]arr){
        Stack<Integer>s=new Stack<>();
        int nge[]=new int[arr.length];
         Arrays.fill(nge, -1);
        for (int i = 0 ; i < arr.length; i++) {
            while (!s.isEmpty() && arr[i]>arr[s.peek()]) {
                nge[s.peek()]= arr[i];
                s.pop();
            } if (s.isEmpty()) {
                nge[i] = -1;
            }
            s.push(i);
        }for (int element : nge) {
            System.out.print(element + " ");
        }
    }
    public static void main(String[] args) {
        int[]arr={8,6,4,7,4,9,10,8,12};
        greater(arr);
        approach2(arr);
    }
}
