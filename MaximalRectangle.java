package STACK;

import java.util.Stack;

public class MaximalRectangle {
    public static void rectangle(char[][]arr){
        Stack<Integer>s=new Stack<>();
        int height[]=new int[arr[0].length];
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if (arr[i][j]=='0') {
                    height[j]=0;
                }else{
                    height[j]++;
                }
            }max=Math.max(max,optimal(height));
        }System.out.println(max);
    }public static int optimal(int[]arr){
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
        return ans;
    }public static void main(String[] args) {
        char[][]arr={
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };
        rectangle(arr);
    }
}
