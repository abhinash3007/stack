package STACK;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void largest(int[]arr){
        int[]right=new int[arr.length];
        int[]left=new int[arr.length];
        Arrays.fill(right, -1);
        Arrays.fill(left, -1);
        Stack<Integer>s=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[i]<arr[s.peek()]) {
                right[s.peek()]=i;
                s.pop();
            }if (s.isEmpty()) {
                right[i]=-1;
            }s.push(i);
        }while (!s.isEmpty()) {
            right[s.peek()]=arr.length;
            s.pop();
        }
        for(int ele:right){
            System.out.print(ele+" ");
        }
        for (int i = arr.length-1; i >= 0; i--) {
            while (!s.isEmpty() && arr[i]<arr[s.peek()]) {
                left[s.peek()]=i;
                s.pop();
            }if (s.isEmpty()) {
                left[i]=-1;
            }s.push(i);
        } 
        System.out.println();
        for(int ele:left){
            System.out.print(ele+" ");
        }int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans=Math.max(ans, arr[i]*(right[i]-left[i]-1));
        }System.out.println();
        System.out.println(ans);
    }public static void optimal(int[]arr){
        Stack<Integer>s=new Stack<>();
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[i]<arr[s.peek()]) {
                int index=s.peek();
                s.pop();
                if (!s.isEmpty()) {
                    ans=Math.max(ans, arr[index]*(i-s.peek()-1));  
                }else{
                    ans=Math.max(ans, arr[index]*i); 
                }
            }s.push(i);
        }while (!s.isEmpty()) {
            int index=s.peek();
            s.pop();
            if (!s.isEmpty()) {
                ans=Math.max(ans, arr[index]*(arr.length-s.peek()-1));  
            }else{
                ans=Math.max(ans, arr[index]*arr.length); 
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[]arr={2,1,5,6,2,3};
        largest(arr);
        int[]arr2={2,3,4,2,6,1,4,5,3};
        //optimal(arr2);
    }
}
