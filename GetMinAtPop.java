package STACK;

import java.util.Stack;

public class GetMinAtPop {
    public static void out(int[]arr){
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            s.push(arr[i]);
        }
        while (!s.isEmpty()) {
            int min=Integer.MAX_VALUE;
            for(int i=0;i<s.size();i++){
                min=Math.min(min, arr[i]);   
            }System.out.println(min);
            //System.out.print(s.peek());
            s.pop();
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,5,0,6};
        out(arr);
    }
}
